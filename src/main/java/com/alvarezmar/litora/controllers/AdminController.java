package com.alvarezmar.litora.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("admin")
public class AdminController {

    public String home() {
        return "hola";
    }

}
