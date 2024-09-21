package com.example.Simple.CRUD.Project.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/products")
    public String index() {
        return "index";
    }
}
