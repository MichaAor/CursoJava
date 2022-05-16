package com.bootcamp.APIDia25ChallengeAlgoritmo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Report {
    private String email, type, list;
}