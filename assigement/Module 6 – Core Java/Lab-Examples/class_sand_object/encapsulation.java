package class_sand_object;
class enc
{
	private int a;
	private String name;
	
	public void seta(int a)
	{
		this.a=a;
	}
	public int geta()
	{
		return a;
	}
	public void  setname(String n)
	{
		name=n;
	}
	public String getname()
	{
		return name;
	}
		
		
}

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enc obj=new enc();
		obj.seta(19);
		obj.setname("jay");
		System.out.println(obj.geta());
		System.out.println(obj.getname());
	}

}
