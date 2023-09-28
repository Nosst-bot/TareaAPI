package com.tarea.generation.services;

import com.tarea.generation.models.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {

    List<Usuario> listarUsuarios();

    Usuario guardarUsuario(Usuario usuarioNuevo);

    void borrarUsuarioPorId(Long id);

    Usuario editarUsuarioPorId(Usuario usuario, Long id);
}
