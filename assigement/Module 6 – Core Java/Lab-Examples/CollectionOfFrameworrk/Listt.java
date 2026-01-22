package CollectionOfFrameworrk;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ls=new ArrayList();
		ls.add("hello");
		ls.add(123);
		ls.add(10.25);
		System.out.println("list elements: "+ls);
		List Linkedlist=new LinkedList<>();
		Linkedlist.add("Apple");
		Linkedlist.add(10.25);
		Linkedlist.add(123);
		System.out.println("LinkedList elements: "+Linkedlist);

	}

}
