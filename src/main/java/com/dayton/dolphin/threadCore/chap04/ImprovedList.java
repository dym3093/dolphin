package com.dayton.dolphin.threadCore.chap04;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 通过组合来实现线程安全
 * Created by bruce on 17-4-26.
 */
public class ImprovedList<T> implements List<T>{
    private final List<T> bubble;

    //重入锁
    private final transient ReentrantLock lock = new ReentrantLock();

    public ImprovedList(List<T> bubble) {
        this.bubble = bubble;
    }

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        ConcurrentHashMap<String,String> safeMap = null;
        CopyOnWriteArrayList<String> cowList =  null;
    }

    /**
     * 如果元素不在线性表中则添加
     * @param target 要添加的元素
     * @return boolean
     */
    public boolean putIfAbsent(T target){
        lock.lock();
        try {
            boolean contain = bubble.contains(target);
            if (!contain) {
                contain = bubble.add(target);
            }
            return contain;
        } finally {
            lock.unlock();
        }
    }

    /**
     * 获取最后一个元素
     * @return T
     */
    public T getLast(){
        synchronized (bubble){
           if (bubble.isEmpty()){
               throw new NullPointerException("Null List");
           }
           return bubble.get(bubble.size()-1);
        }
    }

    /**
     * 删除最后一个元素
     * @return BOOLEAN
     */
    public boolean deleteLast(){
        synchronized (bubble){
            if (bubble.isEmpty()) {
                throw new NullPointerException("Null List");
            }
            return deleteSafe(bubble.size() - 1);
        }
    }

    /**
     * 安全删除制定索引位置的元素
     * @param index 索引位置
     * @return boolean
     */
    public boolean deleteSafe(int index){
        synchronized (bubble){
            boolean flag = false;
            if (bubble.isEmpty()) {
                throw new NullPointerException("Null List");
            }
            if (index >= 0 && index <= bubble.size() - 1) {
                if (bubble.remove(index) != null) {
                    flag = true;
                }
            }
            return flag;
        }
    }

    @Override
    public int size() {
        return bubble.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
