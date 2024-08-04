package com.example.demo.model;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class HomeModel {

    public void prepareModel(Model homeModel) {
        homeModel.addAttribute("title", "Thymeleaf Fetch Example");
    }
}