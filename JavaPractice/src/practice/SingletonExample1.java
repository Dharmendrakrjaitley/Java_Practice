package practice;



//Eager Initialization:
//
//    The instance is created when the class is loaded into memory.

class Singleton
{
	private static Singleton instance=new Singleton();
	private Singleton() {}
	
	public static Singleton getInstance()
	{
		return instance;
	}
	
}



public class SingletonExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj=Singleton.getInstance();
		System.out.println(obj.toString());
		
		Singleton obj1=Singleton.getInstance();
		System.out.println(obj.toString());
		
	
	}

}
