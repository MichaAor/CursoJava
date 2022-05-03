package com.bootcamp.Dia21_PairProgramming.Repository;

import com.bootcamp.Dia21_PairProgramming.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
