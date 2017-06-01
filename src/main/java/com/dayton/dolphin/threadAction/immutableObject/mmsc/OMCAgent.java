package com.dayton.dolphin.threadAction.immutableObject.mmsc;

/**
 * 与运维中心对接的类
 * 模式角色: ImmutableObject.Manipulator
 * Created by bruce on 17-6-1.
 */
public class OMCAgent extends Thread{

    @Override
    public void run() {
        boolean isTableModificationMsg = false;
        String updateTableName = null;
        while (true){
            //TODO
            if (isTableModificationMsg){
                if ("MMSCInfo".equals(updateTableName)){
                    MMSCRouter.setInstance(new MMSCRouter());
                }
            }
        }
        //TODO
    }

}
