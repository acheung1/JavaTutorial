package Shape;

// abstract class are like parent class, but some methods do not have implemented till the child classes
// calculateArea() and calculatePerimeter() have to be implemented in child classes
public abstract class Shape {
	private double area;
	private double perimeter;
	
	public abstract double calculateArea();
	
	public abstract double calculatePerimeter();

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	

}
