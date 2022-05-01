package com.bootcamp.Dia19PairProgramming.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "Unidades")
public class Unidad {
    private String id;
    private String nombre;
    private int ataque;
    private int defensa;
    private String tipo;



}
