package com.unisabana.software.tienda.controller;

import com.unisabana.software.tienda.controller.dto.SaleDTO;
import com.unisabana.software.tienda.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SaleController {
    @Autowired
    private SaleService service;

    public SaleController(List<String> products) {
    }

    @PostMapping("/product/save")
    public void saveTransaction(@RequestBody SaleDTO saleDTO) {
        if(service.limitTransaction(saleDTO.getDocumentClient())) {
            service.saveSale(saleDTO);
        }
    }

    @GetMapping("/product/transactions")
    public List<SaleDTO> allTransactions() {
        return service.findAll();
    }

    @GetMapping("/product/transaction/searchbyid/{ID}")
    public List<SaleDTO> transactionSearchById(@PathVariable("ID") int documentClient) {
        return service.findByDocumentClient(documentClient);
    }
}