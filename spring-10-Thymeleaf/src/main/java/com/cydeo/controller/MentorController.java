package com.cydeo.controller;

import com.cydeo.model.Mentor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register")
    public String register(Model model){

        List<String> batchList = Arrays.asList("JD1","JD2","JD3");
        model.addAttribute("batchList", batchList);

        model.addAttribute("mentor", new Mentor());


        return "/mentor/mentor-register";
    }


    @PostMapping("/confirm")
    public String submitForm1(){

        return "mentor/mentor-confirmation";

    }
    @GetMapping("/confirm")
    public String submitForm2(){

        return "mentor/mentor-confirmation";

    }

}
