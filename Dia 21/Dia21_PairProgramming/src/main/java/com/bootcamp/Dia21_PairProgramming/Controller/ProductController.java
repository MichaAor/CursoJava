package com.bootcamp.Dia21_PairProgramming.Controller;

import com.bootcamp.Dia21_PairProgramming.Model.Product;
import com.bootcamp.Dia21_PairProgramming.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService cs;

    @GetMapping
    public String getAllProducts(Model model){
        model.addAttribute("products",cs.getAllProducts());
        return "index";
    }

    @GetMapping("/create")
    public String showFormProduct(Model model){
        Product product = new Product();
        model.addAttribute("product",product);
        return "productCreate";
    }

    @PostMapping("/create")
    public String registerProduct(@ModelAttribute("product") Product product){
        cs.registerProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/update/{codProd}")
    public String showFormModifyClient(@PathVariable("codProd")long codProduct, Model model){
        Product product = cs.getProductById(codProduct);
        model.addAttribute("product",product);
        return "productUpdate";
    }

    @PostMapping("/update/{codProd}")
    public String modifyProduct(@ModelAttribute("product") Product product,
                               @PathVariable("codProd")long codProduct){
        cs.modifyProduct(product,codProduct);
        return "redirect:/products";
    }

    @GetMapping("/delete/{codProd}")
    public String deleteProduct(@PathVariable("codProd") long codProduct){
        cs.deleteProductById(codProduct);
        return "redirect:/products";
    }
}
