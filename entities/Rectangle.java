package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double Area() {
		return width * height;
	} // fim do m�todo Area
	
	public double Perimeter() {
		return 2 * (width + height);
	} // fim do m�todo Perimeter
	
	public double Diagonal() {
		return Math.sqrt((width * width) + (height * height));
		
	} // fim do m�todo Diagonal
	

} // fim da classe Rectangle
