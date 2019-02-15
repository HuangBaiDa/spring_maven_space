package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 力拔山兮气盖世
 * @version jiahe house 1.0.0
 * @description
 * @date 2019-2-15
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
