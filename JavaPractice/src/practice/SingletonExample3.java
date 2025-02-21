package practice;

//Thread-Safe Singleton (Using synchronized block):
//This implementation uses a synchronized block inside the getInstance() method to ensure that only one thread can create the instance at a time.

class Singleton2
{
	private static Singleton2 instance;
	
	private Singleton2() {}
	
	public static  Singleton2 getInstance()
	{
		if(instance==null)
			instance=new Singleton2();
		
		return instance;
	}
}


public class SingletonExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable thread=()->{
			Singleton2 obj= Singleton2.getInstance();
			System.out.println(obj);
		};
		
		thread.run();
		
		Runnable thread2=()->{
			Singleton2 obj2= Singleton2.getInstance();
			System.out.println(obj2);
		};
		
		thread2.run();
		
	}

}
