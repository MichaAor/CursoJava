package com.bootcamp.Dia21_PairProgramming.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    private long codProd;
    private String name;
    private String description;
    private String type;
    private double price;
}
