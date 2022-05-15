package com.bootcamp.APIDia24ChallengeAlgoritmo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InscripcionRequest {
    private long dniEst;
    private long codMat;
}
