package com.bootcamp.Dia17_ChallengeAlgoritmo.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Estudiantes")
public class EstudianteModel {
    @Id
    private String dni;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String telefono;

}
