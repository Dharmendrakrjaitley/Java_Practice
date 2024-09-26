package practice;

abstract class BoxForYou{
	abstract void show();
	public void print()
	{
		System.out.println("From Print");
	}
}

class BoxChild extends BoxForYou {

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("From TestAbstract class");
	}
	
}

public class TestAbstract
{
	public static void main(String[] args)
	{
		BoxChild obj=new BoxChild();
		obj.show();
	}
}
 
 
