/*
 * Curso Java Completo 2020
 * Prof. Nelio Alves
 * 
 * Se��o 14: Heran�a e Polimorfismo
 * 133. M�todos Abstratos
 * 
 * Vinculado a classe Shape.java 
 * */

package entities;

import entities.enums.Color;

public class Circle extends Shape{
	
	private Double radius;
	
	public Circle() {
		
	}
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

} // Fim da classe Circle
