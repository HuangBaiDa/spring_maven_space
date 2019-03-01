package com.transaction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author hbd
 * Spring页面重定向、静态页面处理例子
 */
@Controller
public class WebController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    /**
     * 页面重定向例子
     *
     * @return
     */
    /*@RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:finalPage";
    }*/
    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage() {
        return "final";
    }

    /**
     * Spring静态页面例子
     *
     * @return
     */
    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:/views/final.html";
    }
}
