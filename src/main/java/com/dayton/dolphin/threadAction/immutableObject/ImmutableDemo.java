package com.dayton.dolphin.threadAction.immutableObject;


import org.apache.xbean.spring.context.FileSystemXmlApplicationContext;
import org.apache.xbean.spring.context.XmlWebApplicationContext;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Created by bruce on 17-6-1.
 */
public class ImmutableDemo {

    public static void main(String[] args){
        ApplicationContext context =
                new FileSystemXmlApplicationContext("xml");
        AbstractBeanDefinitionReader reader = null;
        WebApplicationContext webApplicationContext = null;
        XmlWebApplicationContext xmlWebApplicationContext = null;
        DispatcherServlet dispatcherServlet = null;
        testLocation();
    }

    public static void testLocation(){
        Location location = new Location(2.0, 3.2);
        System.out.println("location org \t ");
        System.out.println(location.toString());
    }
}
