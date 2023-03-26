package com.unisabana.adsoftware.Venta.controller;

import com.unisabana.adsoftware.Venta.controller.dto.ProductDTO;
import com.unisabana.adsoftware.Venta.model.Sale;
import com.unisabana.adsoftware.Venta.service.ICrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ICrudRepository repository;
    public ProductController(List<String> products) {
    }

    @PostMapping(path = "/product/add")
    public void saveProduct(@RequestBody ProductDTO product) {
        //productDB.insertDataBase(product.getName(), product.getPrice(), product.getStock());
    }

    @GetMapping("/product/update/stock")
    public void searchProduct(@RequestParam int code,
                              @RequestParam int stock) {
       //productDB.update(stock,code);
            }
    @PostMapping(path = "/product/sale")
    public String Sale(@RequestParam  ProductDTO products) {
        return ("se vendio tanto");
    }

    @GetMapping("/product/transactions")
    public List <Sale> Transactions() {
        List <Sale> sales = (List<Sale>) repository.findAll();
        return sales;
    }

}
