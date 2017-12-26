package com.example.demo;

import java.awt.List;
import java.util.ArrayList;

/**
 * 
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 */
public class listaPrecios {
	
	private ArrayList<Float> precios;

	public listaPrecios() {
		super();
		this.precios = new ArrayList<Float>();
	}

	
/**
 * 	
 * @param precio precio a insertar en la listas de precios
 */
	public void insertarPrecio(float precio) {
		this.precios.add(precio);
	}
	
	/**
	 * 
	 * @return precio medio de la lista de precios
	 */
	public float calcularPrecioMedio() {
		
		float suma = 0;
		if(this.precios.size()>0) {
		for (Float elemento : precios) {			
			suma+=elemento;			
		}
		return suma/precios.size();
		}
		else return suma;
	}
	
	/**
	 * 
	 * @return precio maximo de la lista de precios
	 */
	public float calculaPrecioMaximo() {
		float maximo = 0;
		if(this.precios.size()>0) {
			maximo =this.precios.get(0);
		for (Float elemento : precios) {			
			if (elemento > maximo)
				maximo = elemento;
		}
		
		}
		return maximo;
		
	}
	
	/**
	 * 
	 * @return precio minimo de la lista de precios
	 */
	public float calcularPrecioMinimo() {
		float minimo = 0;
		
		if(this.precios.size()>0) {
			minimo = this.precios.get(0);
		for (Float elemento : precios) {			
			if (elemento < minimo)
				minimo = elemento;
		}
		
		}
		return minimo;
	}
	
	/**
	 * imprime los elementos de la lista de precios
	 */
	public void imprimirPrecios() {
		this.precios.forEach((k)->System.out.println("Elemento --> + " + k));;
	}
	
	

}
