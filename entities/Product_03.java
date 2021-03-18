/*
 * Curso Java Completo 2020
 * Prof. Nelio Alves
 * 
 * Se��o 14: Heran�a e Polimorfismo
 * 131. Exerc�cio de Fixa��o
 * 
 * Esta classe est� vinculada a classe Program_25.java
 */

package entities;

public class Product_03 {
	
	private String name;
	protected Double price;
	
	public Product_03(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
		return name + " $" + String.format("%.2f", price);		
	}
		
	

} // Fim da classe Product_03
