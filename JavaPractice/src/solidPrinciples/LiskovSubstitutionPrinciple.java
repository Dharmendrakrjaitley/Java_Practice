package solidPrinciples;

//Definition: Subtypes must be substitutable for their base types without altering the correctness of the program.


class Bird {
	public void fly()
	{
		System.out.println("Flying");
	}
}

class Sparrow extends Bird{
	public void fly()
	{
		System.out.println("Flying");
	}
}

class Penguin extends Bird{
	public void fly()
	{
		throw new UnsupportedOperationException("Penguin can't fly");
	}
}

public class LiskovSubstitutionPrinciple {

	public static void main(String[] args) {
		
		Bird b=new Sparrow();
		b.fly();

	}

}
