package com.example.Simple.CRUD.Project.Repository;

import com.example.Simple.CRUD.Project.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {



}
