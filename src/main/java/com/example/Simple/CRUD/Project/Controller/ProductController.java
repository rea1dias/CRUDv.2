package com.example.Simple.CRUD.Project.Controller;

import com.example.Simple.CRUD.Project.Model.Product;
import com.example.Simple.CRUD.Project.Model.ProductDto;
import com.example.Simple.CRUD.Project.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping({"","/"})
    public String showProductList (Model model) {

        List<Product> products = productRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
        model.addAttribute("products", products);
        return "products/index";

    }

    @GetMapping("/create")
    public String showCreatePage(Model model) {
        ProductDto productDto = new ProductDto();
        model.addAttribute("productDto", productDto);
        return "products/add_product";
    }






}
