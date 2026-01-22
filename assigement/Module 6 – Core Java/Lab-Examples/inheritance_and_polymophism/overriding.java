package inheritance_and_polymophism;
class animal
{
	void sound()
	{
		System.out.println("animal makes sound ");
	}
}
class dog extends animal
{
	void sound()
	{
		System.out.println("bhau bhau");
	}
}

public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d1=new dog();
		d1.sound();

	}

}
