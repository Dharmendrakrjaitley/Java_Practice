package practice;

class Box{
	public String name;
	public int rollNumber;
	public String email;
	
	public Box() {
		// TODO Auto-generated constructor stub
		name="Dharmendra";
		rollNumber=123;
		email="dharmendra@gmail.com";
	}
	public Box(String name,int rollnumber,String email)
	{
		this.name=name;
		this.rollNumber=rollnumber;
		this.email=email;
	}
	
	public void show()
	{
		System.out.println("Name: "+ name +"  Roll No:  "+rollNumber +  "  Email:  "+  email);
	}
}

public class Test {
	public static void main(String[] args) {
		Box obj1=new Box();
		Box obj2=new Box("Soham",124,"soham@gmail.com");
		obj1.show();
		obj2.show();
	}


}
