package com.example.first_spring;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloWorldController {

    @RequestMapping(value = "/greeting")
    public String helloWorldController(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        System.out.println("HelloWorldController work...  ln 13 ...");
        model.addAttribute("name", name);
        return "greeting";
    }

}