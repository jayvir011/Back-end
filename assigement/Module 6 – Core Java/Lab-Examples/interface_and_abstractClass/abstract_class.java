package interface_and_abstractClass;
abstract class abs
{
	abstract void disp();
}
class jai extends abs
{
	void disp()
	{
		System.out.println("this is a abstract method of abstract class ");
	}
}


public class abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jai j1=new jai();
		j1.disp();

	}

}
