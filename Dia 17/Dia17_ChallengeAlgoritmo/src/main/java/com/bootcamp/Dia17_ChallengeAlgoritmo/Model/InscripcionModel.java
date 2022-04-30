package com.bootcamp.Dia17_ChallengeAlgoritmo.Model;

import lombok.*;

import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "incripciones")
public class InscripcionModel {
    private String dni;
    private String codMateria;
}
