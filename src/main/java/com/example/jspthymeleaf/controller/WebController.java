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

    @RequestMapping("/test")
    public String jspTest(){
        return "jsp/test/index";
    }

    @RequestMapping("/bean")
    public String jspBean(){
        return "jsp/test/bean";
    }

    @RequestMapping("/forward")
    public String jspForward(){
        return "jsp/test/forward";
    }

    @RequestMapping("/http")
    public String jspHttp(){
        return "jsp/test/http";
    }

    @RequestMapping("/err")
    public String jspError(){
        return "jsp/test/error";
    }

    @RequestMapping("/formMain")
    public String jspFormMain(){
        return "jsp/test_form/main";
    }

    @RequestMapping("/refresh")
    public String jspRefresh(){
        return "jsp/test/refresh";
    }
    @RequestMapping("/htmlTest")
    public String htmlTest(){
        return "templates/test/test";
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

    //欢迎来到jsp模板界面! this is /webapp/WEB-INF/jsp/index.jsp
    @RequestMapping("helloJsp")
    public String helloJsp(){
        return "jsp/hello";
    }


}
