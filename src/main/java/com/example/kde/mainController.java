package com.example.kde;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mainController {

    @GetMapping("/kde")
    @ResponseBody
    public String hello(){
        return "어서오세요.";
    }


    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
