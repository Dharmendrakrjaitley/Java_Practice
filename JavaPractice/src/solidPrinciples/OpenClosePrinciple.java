package solidPrinciples;


abstract class Shape{
	public abstract double area();
}

class Circle extends Shape{

	private double radius;
	public Circle(int r){
		radius=r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	@Override
	public double area() {
		return Math.PI*radius*radius;
	}
	
}


class Rectangle extends Shape{

	private double l;
	private double b;
	
	public Rectangle(int length,int breadth)
	{
		l=length;
		b=breadth;
	}
	
	public double getLength()
	{
		return l;
	}
	
	public double getBreadth()
	{
		return b;
	}
	
	@Override
	public double area() {
		
		return l*b;
	}
	
}

class CalculateArea
{
	
	public double areaCalculate(Shape shape)
	{
		return shape.area();
	}
}


public class OpenClosePrinciple {

	public static void main(String[] args) {
		
		// To get Area of a circle
		Shape circle=new Circle(7);
		CalculateArea cA=new CalculateArea();
		System.out.println("Area of Circle: " + String.format("%.2f", cA.areaCalculate(circle)));
		
		// To get Area of a rectangle
		
		Shape shape=new Rectangle(10, 15);
		CalculateArea rect=new CalculateArea();
		System.out.println("Area of Rectangle: " + rect.areaCalculate(shape));

	}

}


// Problamatic code

/*
 * class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
}

class Rectangle {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.length * rectangle.width;
        }
        return 0;
    }
}
 * 
 * */
 