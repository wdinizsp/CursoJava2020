/*
 * Curso Java Completo 2020
 * Prof. Nelio Alves
 * 
 * Se��o 14: Heran�a e Polimorfismo
 * 131. Exerc�cio de Fixa��o
 * 
 * Esta classe est� vinculada a classe Product_03.java
 */

package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product_03{
	
	private Date manufacturedDate;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct(String name, Double price, Date manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	
	@Override
	public String priceTag() {
		return super.priceTag() + " (Manufacture date: " + sdf.format(manufacturedDate) + ")";
	}
	

} // Fim da classe UsedProduct
