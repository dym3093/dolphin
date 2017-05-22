package com.dayton.dolphin.designModel.flyWeight;/**
 * Created by daimian on 17-5-22.
 */

/**
 * 具体的FlyWeight类
 *
 * @author Damian
 * @create 2017-05-22 下午4:29
 **/
public class ConcreteFlyWeight implements FlyWeight{

    private IntrinsicState state;

    @Override
    public void operation(ExtrinsicState state) {
        IntrinsicState tmp = null;
        if (state instanceof IntrinsicState){
            tmp = (IntrinsicState) state;
        }
        setState(tmp);
    }

    public IntrinsicState getState() {
        return state;
    }

    public void setState(IntrinsicState state) {
        this.state = state;
    }
}
