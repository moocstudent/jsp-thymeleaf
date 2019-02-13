package com.example.jspthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    //hello html at WEB-INF
    @RequestMapping("/hello")  //will return WEB-INF/hello.html
    public String hello() {
        return "hello";
    }

    // index html at /WEB-INF/
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    //redirect to index html at /WEB-INF/
    @RequestMapping("/index")
    public String indeX() {
        return "redirect:/";
    }

    //index jsp at /jsp/
    @RequestMapping("/jsp")
    public String jspIndex(){
        return "jsp/index";
    }

    //index html at /templates/
    @RequestMapping("/html")
    public String htmlIndex(){
        return "templates/index";
    }

    //欢迎来到thymeleaf模板界面! this is /webapp/WEB-INF/templates/hello.html
    @RequestMapping("/helloHtml")
    public String helloHtml(){
        return "templates/hello";
    }

    //欢迎来到jsp模板界面! this is /webapp/WEB-INF/jsp/hello.jsp
    @RequestMapping("helloJsp")
    public String helloJsp(){
        return "jsp/hello";
    }


}
