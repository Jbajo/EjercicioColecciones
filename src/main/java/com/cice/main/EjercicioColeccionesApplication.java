package com.cice.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cice.modelo.ListaPrecios;
import com.cice.negocio.Gestora;

@SpringBootApplication
/**
 * 
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 */
public class EjercicioColeccionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioColeccionesApplication.class, args);
			
		Gestora gestora = new Gestora();
		gestora.showMenu();
		
}
}
