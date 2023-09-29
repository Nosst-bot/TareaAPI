package com.tarea.generation.services;

import com.tarea.generation.models.Tarea;
import com.tarea.generation.models.Usuario;
import com.tarea.generation.repositories.TareaRepository;
import com.tarea.generation.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaServiceImpl implements TareaService{

    @Autowired
    TareaRepository tareaRepository;

    @Autowired
    UsuarioRepository usuarioRepository;
    @Override
    public List<Tarea> listarTarea() {
        return tareaRepository.findAll();
    }

    @Override
    public ResponseEntity<?> guardarTarea(Tarea tarea) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(tarea.getUsuario().getUsuarioId());
        if (usuarioOptional.isPresent()) {
            tarea.setUsuario(usuarioOptional.get());
            tareaRepository.save(tarea);
            return ResponseEntity.ok(tarea);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existe un usuario con ese ID");
    }

    @Override
    public ResponseEntity<?> borrarTareaPorId(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<?> editarTareaPorId(Tarea tarea, Long id) {
        return null;
    }
}
