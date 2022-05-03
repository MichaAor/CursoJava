package com.bootcamp.Dia20_ChallengeAlgoritmo.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "Clientes")
public class Cliente {
    @Id
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;

}
