package com.dayton.dolphin.threadAction.guardedSuspension;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by bruce on 17-6-1.
 */
public class ConditionVarBlocker implements Blocker{

    private final Lock lock;
    private final Condition condition;

    public ConditionVarBlocker(Lock lock) {
        this.lock = lock;
        this.condition = lock.newCondition();
    }

    public ConditionVarBlocker(){
        this.lock = new ReentrantLock();
        this.condition = this.lock.newCondition();
    }

    @Override
    public <V> V callWithGuard(GuardedAction<V> guardedAction) throws Exception {
        lock.lockInterruptibly();
        V result;
        try {
            final Predicate predicate = guardedAction.predicate;
            while (predicate.evaluate()){
                condition.await();
            }
            result = guardedAction.call();
            return result;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void signalAfter(Callable<Boolean> stateOperation) throws Exception {
        lock.lockInterruptibly();
        try {
            if (stateOperation.call()){
                condition.signal();
            }
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void signal() throws InterruptedException {
        lock.lockInterruptibly();
        try {
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void broadcastAfter(Callable<Boolean> stateOperation) throws Exception {
        lock.lockInterruptibly();
        try {
            if (stateOperation.call()){
                condition.signalAll();
            }
        } finally {
            lock.unlock();
        }
    }
}
