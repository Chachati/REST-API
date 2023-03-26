package com.unisabana.adsoftware.Venta.service;

import com.unisabana.adsoftware.Venta.model.Sale;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ICrudRepository extends CrudRepository<Sale , Long> {
    List<Sale> findBydocumentClient(int documentClient);
}
