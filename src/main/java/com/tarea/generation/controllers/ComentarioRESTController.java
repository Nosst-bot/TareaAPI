package com.tarea.generation.controllers;

import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comentario")
public class ComentarioRESTController {

    @GetMapping("/lista")
    public String hola() {
        return "<h1>Este es un comentario</h1>";
    }
}
