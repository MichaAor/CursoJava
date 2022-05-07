package com.bootcamp.Dia18_ChallengeAlgoritmo.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "incripciones")
public class Inscripcion {
    private String dni;
    private String codMat;
}
