package com.bootcamp.Dia22_ChallengeAlgoritmo.Model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
