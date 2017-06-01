package com.dayton.dolphin.threadAction.guardedSuspension;

import java.util.concurrent.Callable;

/**
 * Created by bruce on 17-6-1.
 */
public abstract class GuardedAction<V> implements Callable<V>{

    protected final Predicate predicate;

    protected GuardedAction(Predicate predicate) {
        this.predicate = predicate;
    }

}
