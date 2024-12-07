package Threading;


class ThreadExample extends Thread{
	
	public void run()
	{
		System.out.println("thread executed");
	}
}

public class TestExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread t1=new Thread(new ThreadExample());
		ThreadExample t1=new ThreadExample();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Manin thread");
	}

}
