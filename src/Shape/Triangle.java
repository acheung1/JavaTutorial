package Shape;

// 
public class Triangle extends Shape{
	private double base;
	private double height;

	@Override
	public double calculateArea() {
		this.setArea(0.5 * base * height); 
		return this.getArea();
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
