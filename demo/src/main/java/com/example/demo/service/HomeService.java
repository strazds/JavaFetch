package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class HomeService {

    public void prepareModel(Model homeModel) {
        homeModel.addAttribute("title", "Thymeleaf Fetch Example");
    }
}