package com.sda.twittermvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/secured")
public class SecuredController {

    @GetMapping
    public void secured(){

    }
}
