package com.bootcamp.MVCDia24ChallengeAlgoritmo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Inscripcion {
    private long id;
    private Materia materia;
    private Estudiante estudiante;

    public Inscripcion(Materia mat,Estudiante est){
        this.materia = mat;
        this.estudiante = est;
    }
}
