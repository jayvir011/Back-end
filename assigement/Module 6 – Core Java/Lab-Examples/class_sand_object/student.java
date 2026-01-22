package class_sand_object;
class std
{
	int age;
	String name;
	void setdata(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	void show()
	{
		System.out.print(name+" ");
		System.out.println(age);
	}
}

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		std obj=new std();
		obj.setdata(19, "jay");
		obj.show();

	}

}
