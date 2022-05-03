package com.bootcamp.Dia21_PairProgramming.Controller;

import com.bootcamp.Dia21_PairProgramming.Model.Product;
import com.bootcamp.Dia21_PairProgramming.Model.Ticket;
import com.bootcamp.Dia21_PairProgramming.Service.ProductService;
import com.bootcamp.Dia21_PairProgramming.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tickets")
public class TicketController {
    @Autowired
    TicketService ts;
    ProductService ps;

    @GetMapping
    public String getAllTickets(Model model){
        model.addAttribute("tickets",ts.getAllTickets());
        return "index";
    }

    @GetMapping("/create")
    public String showFormTicket(Model model){
        Ticket ticket = new Ticket();
        model.addAttribute("ticket",ticket);
        model.addAttribute("products",ps.getAllProducts());
        return "index";
    }

    @PostMapping("/create")
    public String registerTicket(@ModelAttribute("ticket") Ticket ticket){
        ts.registerTicket(ticket);
        return "redirect:/tickets";
    }
/*
    @GetMapping("/update/{codProd}")
    public String showFormModifyClient(@PathVariable("codProd")long codProduct, Model model){
        Product product = ts.getProductById(codProduct);
        model.addAttribute("product",product);
        return "productUpdate";
    }


    @PostMapping("/update/{codProd}")
    public String modifyProduct(@ModelAttribute("product") Product product,
                                @PathVariable("codProd")long codProduct){
        ts.modifyProduct(product,codProduct);
        return "redirect:/products";
    }

    @GetMapping("/delete/{codProd}")
    public String deleteProduct(@PathVariable("codProd") long codProduct){
        ts.deleteProductById(codProduct);
        return "redirect:/products";
    }

 */
}
