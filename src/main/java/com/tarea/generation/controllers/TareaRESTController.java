package com.tarea.generation.controllers;

import com.tarea.generation.models.Comentario;
import com.tarea.generation.services.ComentarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarea")
public class TareaRESTController {

    @Autowired
    ComentarioServiceImpl comentarioService;

    @GetMapping("/lista")
    public List<Comentario> hola(){
        return comentarioService.listarComentario();
    }

    @PostMapping("/registrar")
    public ResponseEntity<?> nuevoComentario(@RequestBody Comentario comentario) { return comentarioService.guardarComentario(comentario); }


}
