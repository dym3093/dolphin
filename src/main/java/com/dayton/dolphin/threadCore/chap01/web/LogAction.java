package com.dayton.dolphin.threadCore.chap01.web;/**
 * Created by daimian on 17-4-20.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 日志
 *
 * @author Damian
 * @create 2017-04-20 下午6:10
 **/
public class LogAction {

    @RequestMapping("/show")
    public void show(){
       ModelAndView mav = new ModelAndView("Hello");
    }
}
