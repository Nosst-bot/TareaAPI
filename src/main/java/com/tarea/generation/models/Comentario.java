package com.tarea.generation.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "comentario")
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long comentarioId;

    @Column(name = "texto")
    private String texto;

    @Column(name = "fecha_de_creacion")
    private Date fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "tarea_id")
    private Tarea tarea;

}
