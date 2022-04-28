package com.bootcamp.Dia17_ChallengeAlgoritmo.Model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Usuarios")
public class UserModel{
    @Id
    private String email;
    @Column(name = "Nombre")
    private String name;
    @Column(name = "Password")
    private String password;


}
