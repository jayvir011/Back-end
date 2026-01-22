package Arrays_and_Strings;

public class reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="pop";
		String reverse="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			reverse=reverse+s1.charAt(i);
		}
		System.out.println("hola");
		if(reverse.equals(s1))
		{
			System.out.println(s1+" is palindrome");
		}
		else
		{
			System.out.println(s1+" is not palindrome");
		}
		System.out.println(reverse);
		

	}

}
