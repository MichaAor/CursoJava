package com.bootcamp.Dia21_ChallengeAlgoritmo.Model;

import lombok.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Clientes")
public class Cliente {
    @Id
    @Min(1)
    @NotEmpty(message = "Se requiere dni")
    @NotNull()
    private String dni;
    @NotEmpty(message = "Se requiere nombre")
    @NotNull()
    private String nombre;
    @NotEmpty(message = "Se requiere apellido")
    @NotNull()
    private String apellido;
    @NotEmpty(message = "Se requiere email")
    @NotNull()
    private String email;
    @NotEmpty(message = "Se requiere direccion")
    @NotNull()
    private String direccion;
    @NotEmpty(message = "Se requiere avatar")
    @NotNull()
    private String avatar;

}
