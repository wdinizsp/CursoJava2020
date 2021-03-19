/*
 * Curso Java Completo 2020
 * Prof. Nelio Alves
 * 
 * Se��o 14: Heran�a e Polimorfismo
 * 133. M�todos Abstratos
 * 
 * Vinculado a classe Program_26.java
 */

package entities;

import entities.enums.Color;

public abstract class Shape {
	
	private Color color;
	
	public Shape() {
		
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();

}
