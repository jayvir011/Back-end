package multithreading;
class counter 
{
	private int count=0;
	public synchronized void increment()
	{
		count++;
	}
	public int getCount()
	{
		return count;
	}
}


public class synchronizing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		counter c=new counter();
		Thread t1=new Thread(()->{
			for(int i=1;i<=1000;i++)
			{
				c.increment();
			}
		}
	);
		counter c1=new counter();
		Thread t2=new Thread(()->
		{
			for(int i=1;i<=1000;i++)
			{
				c.increment();
			}
		}
				);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c.getCount());
		
	}

}
