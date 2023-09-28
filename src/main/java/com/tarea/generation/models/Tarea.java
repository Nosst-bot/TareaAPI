package com.tarea.generation.models;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tarea")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long tareaId;

    @Column(name = "titulo", length = 25)
    private String titulo;

    @Column(name = "descripcion", length = 90)
    private String descripcion;

    @Column(name = "fecha_vencimiento")
    private Date fechaVencimiento;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "tarea", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;


    /*
    public class DateFormatter {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(date);
        System.out.println(formattedDate); // 27/09/2023
    }
}
     */
}
