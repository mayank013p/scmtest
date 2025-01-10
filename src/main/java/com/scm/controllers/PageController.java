package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping({"/home", "/"}) 
    public String home(Model model){
        System.out.println("Home page handler");
        model.addAttribute("name","Mayank");
        model.addAttribute("age","17");
        model.addAttribute("city","Hanumangarh");
        model.addAttribute("link","http://facebook.com");
        return "home";
    }

    // about rout
    @RequestMapping("/about")
    public String aboutPage(Model model){
        model.addAttribute("islogin", "true");
        System.out.println("About this page");
        return "about";
    }
    

    // services
    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("Services page loading");
        return "services";
    }
}
