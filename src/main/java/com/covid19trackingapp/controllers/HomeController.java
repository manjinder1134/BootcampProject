package com.covid19trackingapp.controllers;
import com.covid19trackingapp.services.CovidAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private CovidAppService covidAppService;
    @GetMapping("/")
    public String home(Model model){
    model.addAttribute("localStats", covidAppService.getAllStats());
        return "home";
    }
}
