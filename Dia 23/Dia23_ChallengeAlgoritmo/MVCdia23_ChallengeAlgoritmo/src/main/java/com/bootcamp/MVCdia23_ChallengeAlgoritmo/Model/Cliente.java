package com.bootcamp.MVCdia23_ChallengeAlgoritmo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente{
    private long dni;
    private String nombre;
    private String apellido;
    private String telefono;
}
