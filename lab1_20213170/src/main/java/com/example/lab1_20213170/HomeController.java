package com.example.lab1_20213170;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/principal"})
    public String verPrincipal(){
        return "index";
    }

}
