package com.tarea.generation.controllers;

import com.tarea.generation.models.Usuario;
import com.tarea.generation.services.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioRESTController {

    @Autowired
    UsuarioServiceImpl usuarioService;

    @GetMapping("/lista")
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @PostMapping("/registrar")
    public Usuario crearUsuario(@RequestBody Usuario nuevoUsuario) {
        return usuarioService.guardarUsuario(nuevoUsuario);
    }

    @DeleteMapping("/borrar")
    public ResponseEntity<String> borrarUsuarioPorId(@RequestParam Long id){
        usuarioService.borrarUsuarioPorId(id);
        return ResponseEntity.ok("Se ha borrado el usuario con id: " +id);
    }

    @PutMapping("/editar/{id}")
    public Usuario editarUsuarioPorId(@PathVariable Long id, @RequestBody Usuario usuario){
        return usuarioService.editarUsuarioPorId(usuario, id);
    }
}
