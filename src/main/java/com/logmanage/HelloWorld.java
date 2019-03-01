package com.logmanage;

/**
 * @author hbd
 * Log4J日志例子用到的POJO
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }
}
