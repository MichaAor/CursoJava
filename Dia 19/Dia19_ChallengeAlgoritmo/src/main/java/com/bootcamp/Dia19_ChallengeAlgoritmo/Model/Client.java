package com.bootcamp.Dia19_ChallengeAlgoritmo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Clients")
public class Client {
    @Id
    private String dni;
    private String name;
    private String surname;
    private String phone;
    private String address;
}
