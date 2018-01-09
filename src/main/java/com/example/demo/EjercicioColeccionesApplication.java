package com.example.demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * 
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 */
public class EjercicioColeccionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioColeccionesApplication.class, args);
			
		ListaPrecios lista = new ListaPrecios();
		int opcion = 1;
		Scanner sc = new Scanner (System.in);
		
		do {
			System.out.println("-------------------");
			System.out.println("Seleccione una opcion");
			System.out.println("Nuevo precio--> (1)");
			System.out.println("Precio medio --> (2)");
			System.out.println("Precio maximo--> (3)");
			System.out.println("Precio minimo---> (4)");
			System.out.println("Monstrar todos--> (5)");
			System.out.println("Salir-->(0)");
			System.out.println("-------------------");
			opcion = sc.nextInt();	
			
			switch (opcion){			
			case 1:
				System.out.println("Introduzca un precio");
				lista.insertarPrecio(sc.nextFloat());
				break;
			case 2:
				System.out.println("El precio medio es --> " + lista.calcularPrecioMedio());
				break;
			case 3:
				System.out.println("El precio maximo es --> " + lista.calculaPrecioMaximo());
				break;
			case 4:
				System.out.println("El precio maximo es --> " + lista.calcularPrecioMinimo());
				break;
			case 5:
				lista.imprimirPrecios();
				break;
			case 0:
				System.out.println("Saliendo del programa");
				break;
			default:
				System.out.println("Opcion errónea");
				break;			
			}			
		}while(opcion!=0);
		
	}
}
