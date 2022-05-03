package com.bootcamp.Dia21_PairProgramming.Model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    private long numTicket;
    private String local;
    private Date date;
    private double total;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "sales",joinColumns = @JoinColumn(name = "numTicket"), inverseJoinColumns = @JoinColumn(name = "codProd"))
    private Set<Product> products;
}
