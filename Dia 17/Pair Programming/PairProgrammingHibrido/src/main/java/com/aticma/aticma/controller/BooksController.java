package com.aticma.aticma.controller;

import com.aticma.aticma.model.Books;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Controller
public class BooksController {

        List<Books> books;


        @GetMapping("/")
        public String getAllBooks(Model model){
            books = new ArrayList<>();
            books.add(new Books("principito", "Antoine de Saint-Exupéry", "loremloremlorem", "Cuento de hadas, Literatura infantil, Fábula", "loremloremlorem", 23442));
            books.add(new Books("Harry potter", "J. K. Rowling", "loremloremlorem", "Fantasía", "loremloremlorem", 324242));
            books.add(new Books("Moby-Dick", "Herman Melville", "loremloremlorem", "Novela", "loremloremlorem", 23442));

            model.addAttribute("books", books);
            return "index";
        }
}
