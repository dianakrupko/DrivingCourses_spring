package net.codejava.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping
    public String main(){
        return "index";
    }
    @RequestMapping("/hello")
    public String sayHello(Model model){
//        System.out.printf("say hello spring");
        model.addAttribute("message","Greetings");
        return "hello";
    }
    @RequestMapping("/he")
    public String sayHe(){
//        System.out.printf("say hello spring");
        return "he";
    }
}
