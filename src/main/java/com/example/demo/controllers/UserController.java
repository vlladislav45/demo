package com.example.demo.controllers;

import com.example.demo.entity.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController extends BaseController {
    private final UserService userService;
    private ModelAndView modelAndView;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public ModelAndView getIndex() {
        ModelAndView test = new ModelAndView();


        User user = (User) this.userService.getById(1);
        test.addObject("message", user.getUsername());
        test.setViewName("index");
        return test;
//        return this.view("index");
    }

    @GetMapping("/")
    public ModelAndView getIndex(ModelMap map) {
        map.addAttribute("message", "what");
        return this.view("index");
    }
}
