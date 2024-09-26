package practice;

class Employee{
	public void showName()
	{
		System.out.println("Dharmendra from Employee class");
	}
	public void showDesignation()
	{
		System.out.println("Software Engineer");
	}
}


class TestEmployee extends Employee{
	public void showName()
	{
		System.out.println("Rahul from TestEmployee class");
	}
}

public class TestMethodOverriding {
	
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.showName();
	}

}
