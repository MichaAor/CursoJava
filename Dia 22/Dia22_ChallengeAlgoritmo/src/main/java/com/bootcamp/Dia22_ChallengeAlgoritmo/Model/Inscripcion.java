package com.bootcamp.Dia22_ChallengeAlgoritmo.Model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "inscripciones")
public class Inscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(cascade = {CascadeType.REMOVE})
    private Materia materia;
    @ManyToOne(cascade = {CascadeType.REMOVE})
    private Estudiante estudiante;  

    public Inscripcion(Materia mat,Estudiante est){
        this.materia = mat;
        this.estudiante = est;
    }
}
