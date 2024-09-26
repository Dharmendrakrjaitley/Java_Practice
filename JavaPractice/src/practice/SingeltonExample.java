package practice;

class MyThread1 extends Thread
{
	public void run()
	{
		System.out.println(SingeltonExample.getInstance());
	}
}

class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println(SingeltonExample.getInstance());
	}
}

public class SingeltonExample {
	
	private SingeltonExample(String str) {
		System.out.println(str);
	};
	
	private static SingeltonExample instance;
	
	public static synchronized SingeltonExample getInstance()
	{
		if(instance==null)
		{
			instance= new SingeltonExample("Hello");
		}
		return instance;
	}
	
	public static void main(String[] args) {
		
		MyThread1 t1=new MyThread1();
		MyThread2 t2=new MyThread2();
		
		t1.start();
		t2.start();
	}

}
