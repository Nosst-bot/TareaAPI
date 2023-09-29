package com.tarea.generation.services;


import com.tarea.generation.models.Comentario;
import com.tarea.generation.models.Tarea;
import com.tarea.generation.repositories.ComentarioRepository;
import com.tarea.generation.repositories.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComentarioServiceImpl implements ComentarioService{

    @Autowired
    ComentarioRepository comentarioRepository;

    @Autowired
    TareaRepository tareaRepository;

    @Override
    public List<Comentario> listarComentario() {
        return comentarioRepository.findAll();
    }

    @Override
    public ResponseEntity<?> guardarComentario(Comentario comentario) {
        Optional<Tarea> tareaOptional = tareaRepository.findById(comentario.getComentarioId());

        if (tareaOptional.isPresent()) {
            comentario.setTarea(tareaOptional.get());
            comentarioRepository.save(comentario);
            return ResponseEntity.ok(comentario);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existe una tarea con el ID: "+comentario.getComentarioId());
        }

    }

    @Override
    public ResponseEntity<?> borrarComentarioPorId(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<?> editarComentarioPorId(Comentario comentario, Long id) {
        return null;
    }
}
