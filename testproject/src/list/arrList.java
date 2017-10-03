package list;

import java.util.ArrayList;
import java.util.Iterator;


public class arrList {

	public static void main(String[] args) {
		
		
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		System.out.println(al.size());
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
			
		{
			
			System.out.println(itr.next());
		}
		
		
		
		al.add(0,11);
		al.remove((Integer)20);
		//al.remove(20);
		al.set(1,80);
		System.out.println(al.get(1));
		
		Iterator itr2=al.iterator();
		while(itr2.hasNext())
			
		{
			
			System.out.println(itr2.next());
		}
		
		
		System.out.println(al.isEmpty());
		System.out.println(al.contains(80));

	}

}
