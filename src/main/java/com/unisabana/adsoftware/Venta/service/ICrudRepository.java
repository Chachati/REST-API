package com.unisabana.adsoftware.Venta.service;

import com.unisabana.adsoftware.Venta.model.Sale;
import org.springframework.data.repository.CrudRepository;


public interface ICrudRepository extends CrudRepository<Sale , Long> {
}
