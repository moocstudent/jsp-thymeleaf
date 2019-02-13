//package com.example.jspthymeleaf.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//
///**
// *
//* Title: UserRestController
//* Description:
//* 用户控制层
//* Version:1.0.0
//* @author pancm
//* @date 2018年3月19日
// */
//@Controller
//public class UserRestController {
////		@Autowired
////		private UserService userService;
//
//
//
//
////		@RequestMapping("/")
////	    public String index() {
////	        return "redirect:/list";
////	    }
//
//
//
//
//
//	    @RequestMapping("/list")
//	    public String list(Model model) {
//	    	System.out.println("Thymeleaf查询所有");
////	        List<User> users=userService.findAll();
//	        model.addAttribute("users", "zhang3");
//	        return "templates/user/list";
//	    }
//
//	    @RequestMapping("/toAdd")
//	    public String toAdd() {
//	        return "templates/user/userAdd";
//	    }
//
////	    @RequestMapping("/add")
////	    public String add(User user) {
////	        userService.addUser(user);
////	        return "redirect:/list";
////	    }
//
////	    @RequestMapping("/toEdit")
////	    public String toEdit(Model model, Long id) {
////	        User user=userService.findUserById(id);
////	        model.addAttribute("user", user);
////	        return "templates/user/userEdit";
////	    }
//
////	    @RequestMapping("/edit")
////	    public String edit(User user) {
////	        userService.updateUser(user);
////	        return "redirect:/list";
////	    }
////
////
////	    @RequestMapping("/toDelete")
////	    public String delete(Long id) {
////	        userService.deleteUser(id);
////	        return "redirect:/list";
////	    }
//}
