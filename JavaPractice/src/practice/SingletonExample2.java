package practice;


//Lazy Initialization (Thread-unsafe):
//
//    The instance is created only when it is first needed. However, this approach can lead to issues in a 
//    multithreaded environment.
//


class Singleton1
{
	private static Singleton1 instance;
	private Singleton1() {}
	
	public static Singleton1 getInstance()
	{
		if(instance==null)
		{
			instance=new Singleton1();
			return instance;
		}
		return instance;
		
	}
}

public class SingletonExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton1 obj= Singleton1.getInstance();
		System.out.println(obj);
	}

}
