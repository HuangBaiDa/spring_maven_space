package com.logmanage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author hbd
 * 使用 Jakarta Commons Logging(JCL) API 在你的 Spring 应用程序中生成日志(日志文件位置：log4j.properties中配置)
 */
public class MainApp1 {
    //需要这个包的唯一文件是 commons-logging-x.y.z.jar 文件
    static Log log = LogFactory.getLog(MainApp.class.getName());

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
        log.info("Going to create HelloWord Obj");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        log.info("Exiting the program");
    }
}
