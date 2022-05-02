package com.aticma.aticma.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
    private String title;
    private String author;
    private String description;
    private String gender;
    private String publisher;
    private int isbn;
}
