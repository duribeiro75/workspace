package br.com.eduardon.regescweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(HttpServletRequest request){
        request.setAttribute("nome", "Eduardo");
        return "hello";
    }
}
