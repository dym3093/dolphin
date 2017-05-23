package com.dayton.dolphin.designModel.cor;

/**
 * Created by bruce on 17-5-23.
 */
public class ConcreateHandler implements Handler{

    private Handler successor;

    public ConcreateHandler(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void handlerRequest(MyRequest request) {
        if (request instanceof HelpRequest){
            HelpRequest helpRequest = (HelpRequest) request;
            helpRequest.execute();
        }else if (request instanceof PrintRequest){
            PrintRequest printRequest = (PrintRequest) request;
            printRequest.execute();
        }else {
            successor.handlerRequest(request);
        }
    }
}
