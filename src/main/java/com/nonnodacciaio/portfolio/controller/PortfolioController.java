package com.nonnodacciaio.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/calculator")
    public String calculator() {
        return "calculator";
    }
}
