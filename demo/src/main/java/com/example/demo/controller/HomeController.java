package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.HomeModel;

@Controller
public class HomeController {

    private final HomeModel homeModel;

    public HomeController(HomeModel homeModel) {
        this.homeModel = homeModel;
    }

    @GetMapping("/")
    public String index(Model model) {
        homeModel.prepareModel(model);
        return "index";
    }
}
