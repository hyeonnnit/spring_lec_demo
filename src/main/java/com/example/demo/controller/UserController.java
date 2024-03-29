package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/joinForm")
    public String joinForm(){
        return "joinForm";
    }
//    @PostMapping("/join")
//    public String join(HttpServletRequest req){
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        String email = req.getParameter("email");
//        System.out.println("username: "+username);
//        System.out.println("password: "+password);
//        System.out.println("email: "+email);
//        return "main";
//    }
    @PostMapping("/join")
    public String join(String username, String password, String email){
        System.out.println("username: "+username);
        System.out.println("password: "+password);
        System.out.println("email: "+email);
        if (username.length()>10){
            return "error-404";
        }
        return "redirect:/main";
    }
}
