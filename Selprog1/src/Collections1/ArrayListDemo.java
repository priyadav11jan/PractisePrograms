package Collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<Integer>();	
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		al.add(700);
		
		System.out.println("before removal"+al.size());
		al.remove(0);
		System.out.println("after removal"+al.size());
		
		System.out.println(al.get(0));
		
		for(Integer list:al)
		{
			
			System.out.println(al);
		}
		
		al.remove((Integer)200);
		

		Collections.reverse(al);
		Collections.
		
		Iterator<Integer> itr =al.iterator();
		
		while(itr.hasNext())
			
		{
			
			System.out.println(itr.next());
		}
		
		

	}

}
