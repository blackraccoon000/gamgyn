package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloSpringController {

    @GetMapping("/hello")
    public String hello(Model model) {
      // model.addAttribute("message", "Hello, Thymeleaf!");
      System.out.println("xxxxxxx");
        // HTMLテンプレートにhllo-spring.htmlを指定
        return "hello-spring";
    }
}
