package org.lesson.java.hello_spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String Home(){
        return "index";
    }

    @GetMapping("/about")
    public String getMethodName(Model model, @RequestParam(name = "name") String name) {
        model.addAttribute("name", name);

        return "about";
    }
    
}
