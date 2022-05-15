package com.bootcamp.MVCDia25ChallengeAlgoritmo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante {
    private long dni;
    private String nombre;
    private String apellido;
    private String telefono;
}
