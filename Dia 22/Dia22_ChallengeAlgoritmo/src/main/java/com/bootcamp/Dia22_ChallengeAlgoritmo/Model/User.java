package com.bootcamp.Dia22_ChallengeAlgoritmo.Model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
public class User {
    @Id
    private String email;
    private String username;
    private String password;
}
