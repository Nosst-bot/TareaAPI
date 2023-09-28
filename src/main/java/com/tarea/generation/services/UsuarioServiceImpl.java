package com.tarea.generation.services;

import com.tarea.generation.models.Usuario;
import com.tarea.generation.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario guardarUsuario(Usuario usuarioNuevo) {
        return usuarioRepository.save(usuarioNuevo);
    }

    @Override
    public void borrarUsuarioPorId(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario editarUsuarioPorId(Usuario usuario, Long id) {
        if (usuarioRepository.existsById(id)){
            Usuario usuarioEditado = usuarioRepository.findById(id).get();

            usuarioEditado.setNombreUsuario(usuario.getNombreUsuario());
            usuarioEditado.setEmail(usuario.getEmail());

            return usuarioRepository.save(usuarioEditado);
        } else {
            System.out.println("No se encuentra el usuario con ese ID");
            return null;
        }
    }
}
