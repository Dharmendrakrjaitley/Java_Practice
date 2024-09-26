package Threading;

class MyThread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("My Thread executed");
	}
	
}

public class TestExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyThread myThread=new MyThread();
		Thread t1=new Thread(new MyThread());
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Thread executed");
		
	}

}
