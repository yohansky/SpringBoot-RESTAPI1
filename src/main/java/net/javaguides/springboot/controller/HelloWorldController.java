package net.javaguides.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
//bisa pakai 2 anotation diatas / bisa pakai 1 anotation dibawah (sudah mencakup anotation 2 diatas)
@RestController

public class HelloWorldController {

    // HTTP Get Request
    // http://localhost:8080/hello-world
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World!";
    }
}
