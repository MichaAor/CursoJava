package com.bootcamp.Dia21_PairProgramming.Service;

import com.bootcamp.Dia21_PairProgramming.Model.Product;
import com.bootcamp.Dia21_PairProgramming.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {
    @Autowired
    ProductRepository pr;

    public ArrayList<Product> getAllProducts(){
        return (ArrayList<Product>) pr.findAll();
    }

    public Product getProductById(long id){
        return pr.getById(id);
    }

    public void registerProduct(Product product){
        pr.save(product);
    }

    public void deleteProductById(long id){
        pr.deleteById(id);
    }

    public void modifyProduct(Product product,long id){
        product.setCodProd(id);
        pr.save(product);
    }
}
