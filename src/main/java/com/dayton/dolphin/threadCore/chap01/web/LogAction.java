package com.dayton.dolphin.threadCore.chap01.web;/**
 * Created by daimian on 17-4-20.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 日志
 *
 * @author Damian
 * @create 2017-04-20 下午6:10
 **/
@Controller
public class LogAction {

    @RequestMapping("/show")
    @ResponseBody
    public void show(){
        System.out.println("show");
        ModelAndView mav = new ModelAndView("Hello");
    }
}
