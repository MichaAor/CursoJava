package com.bootcamp.MVCDia25ChallengeAlgoritmo.Model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String email;
    private String username;
    private String password;
}
