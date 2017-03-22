package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ari on 22.03.2017.
 */
@Controller
public class HelloController {

    @RequestMapping(value ={"/hello","/hi"})
    public String hello(){
        return "hello";
    }

    @RequestMapping(value = {"/home","/"})
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

}
