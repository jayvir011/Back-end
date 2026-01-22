package multithreading;
class thread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread 1: "+i);
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
}

public class thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread1 t1=new thread1();
		t1.start();

	}

}
