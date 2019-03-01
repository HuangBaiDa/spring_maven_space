package com.logmanage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;

/**
 * @author hbd
 * Spring 应用程序中使用 Log4J(注意与commons.logging的区别)
 */
public class MainApp {
    static Logger log = Logger.getLogger(MainApp.class.getName());

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
        log.info("Going to create HelloWord Obj");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        log.info("Exiting the program");
    }
}
