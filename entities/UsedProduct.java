/*
 * Curso Java Completo 2020
 * Prof. Nelio Alves
 * 
 * Seção 14: Herança e Polimorfismo
 * 131. Exercício de Fixação
 * 
 * Esta classe está vinculada a classe Product_03.java
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
