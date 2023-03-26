package com.unisabana.adsoftware.Venta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.unisabana.adsoftware.Venta.repository.ProductDB;

import java.sql.SQLException;

@SpringBootApplication
public class VentaApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(VentaApplication.class, args);
		//ProductDB productDB = new ProductDB();

		}
}
