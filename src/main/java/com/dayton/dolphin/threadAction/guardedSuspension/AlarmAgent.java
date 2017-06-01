package com.dayton.dolphin.threadAction.guardedSuspension;

/**
 * 负责连接警告服务器，并发送警告信息到警告服务器
 * Created by bruce on 17-6-1.
 */
public class AlarmAgent {

    //记录AlarmAgent是否连接到警告服务器
    private volatile boolean connectedToServer = false;

}
