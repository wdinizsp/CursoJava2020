/*
 * Curso Java Completo 2020
 * Prof. Nelio Alves
 * 
 * Seção 14: Herança e Polimorfismo
 * 133. Métodos Abstratos
 * 
 * Vinculado a classe Shape.java 
 * */

package entities;

import entities.enums.Color;

public class Rectangle_01 extends Shape{
	
	private Double width;
	private Double height;
	
	public Rectangle_01(){
		
	}
	
	public Rectangle_01(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
	
	

} // Fim da classe Rectangle_01
