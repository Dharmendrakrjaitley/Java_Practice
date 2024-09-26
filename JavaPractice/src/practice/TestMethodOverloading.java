package practice;

class Shape{
	
	public double findArea(int length,int breadth)
	{
		return length*breadth;
	}
	public double findArea(int radious)
	{
		return 3.14 * radious*radious;
	}
	
}

public class TestMethodOverloading {

	public static void main(String[] args) {
		Shape obj=new Shape();
		double result1=obj.findArea(5);
		double result2=obj.findArea(5, 6);
		
		System.out.println("Area of Circle: "+result1);
		System.out.println("Area of Rectange: "+result2);
	}

}
