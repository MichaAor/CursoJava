package com.bootcamp.Dia22PairProgramming.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Especialidad")
public class Especialidad{
    @Id
    private String id;
    private String nombre;
    private int cantEsp;
}
