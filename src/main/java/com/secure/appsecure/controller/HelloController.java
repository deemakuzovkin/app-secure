package com.secure.appsecure.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello(@AuthenticationPrincipal final UserDetails userDetails){
        System.out.print(String.format("User: [%s] - Authentication!\n",userDetails.getUsername()));
        return "Hi!";
    }

}
