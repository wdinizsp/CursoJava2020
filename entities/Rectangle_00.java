package entities;

public class Rectangle_00 {
	
	public double width;
	public double height;
	
	public double Area() {
		return width * height;
	} // fim do método Area
	
	public double Perimeter() {
		return 2 * (width + height);
	} // fim do método Perimeter
	
	public double Diagonal() {
		return Math.sqrt((width * width) + (height * height));
		
	} // fim do método Diagonal
	

} // fim da classe Rectangle_00
