package com.dayton.dolphin.threadCore.chap04;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by bruce on 17-4-25.
 */
public class VisualComponent {

    private final List<KeyListener> keyListeners = new CopyOnWriteArrayList<KeyListener>();
    private final List<MouseListener> mouseListeners = new CopyOnWriteArrayList<MouseListener>();

    public boolean addKeyListener(KeyListener listener){
        return keyListeners.add(listener);
    }

    public boolean removeKeyListener(KeyListener listener){
        return keyListeners.remove(listener);
    }

    public boolean addMouseListener(MouseListener listener){
        return mouseListeners.add(listener);
    }

    public boolean removeMouseListener(MouseListener listener){
        return mouseListeners.remove(listener);
    }

}
