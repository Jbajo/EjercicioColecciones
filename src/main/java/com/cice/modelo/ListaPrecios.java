package com.cice.modelo;

import java.util.ArrayList;

/**
 * 
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 */
public class ListaPrecios {
	
	private ArrayList<Double> precios;

	public ListaPrecios() {
		super();
		this.precios = new ArrayList<Double>();
	}

	
/**
 * 	
 * @param precio precio a insertar en la listas de precios
 */
	public void insertarPrecio(double precio) {
		this.precios.add(precio);
	}
	
	/**
	 * 
	 * @return precio medio de la lista de precios
	 */
	public double calcularPrecioMedio() {
		
		final double[] suma = new double[]{0};
		
		if(this.precios.size()>0) {
			this.precios.forEach(k->{suma[0]+=k;});	
			return suma[0]/this.precios.size();
		}
		else
			return 0;
		
	}
	
	/**
	 * 
	 * @return precio maximo de la lista de precios
	 */
	public double calculaPrecioMaximo() {
		final double maximo[] = new double[] {0};
		if(this.precios.size()>0) {
			maximo[0] =this.precios.get(0);
			this.precios.forEach(k->{if(k>maximo[0]) maximo[0] = k;});		
		}
		return maximo[0];
		
	}
	
	/**
	 * 
	 * @return precio minimo de la lista de precios
	 */
	public double calcularPrecioMinimo() {
		final double minimo[] = new double[] {0};
		if(this.precios.size()>0) {
			minimo[0] =this.precios.get(0);
			
			this.precios.forEach(k->{if(k<minimo[0]) minimo[0] = k;});
		}
		return minimo[0];
	}
	
	/**
	 * imprime los elementos de la lista de precios
	 */
	public void imprimirPrecios() {
		this.precios.forEach((k)->System.out.println("Elemento --> + " + k));;
	}
	
	

}
