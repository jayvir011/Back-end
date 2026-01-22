package interface_and_abstractClass;
interface disp
{
	void show();
}
interface print
{
	void showw();
}
class inh implements disp,print
{
	public void show()
	{
		System.out.println("this is a disp interface");
	}
	public void showw()
	{
		System.out.println("this is a print interface");
	}
}

public class Multiple_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inh i1=new inh();
		i1.show();
		i1.showw();

	}

}
