package com.bootcamp.APIDia25ChallengeAlgoritmo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long dni;
    private String nombre;
    private String apellido;
    private String telefono;
}
