package com.apicafeteria.infrastructure.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class SaludoController {

    @GetMapping("/saludo")
    public String obtenerSaludo() {
        return "Hola, como estas?";
    }


}
