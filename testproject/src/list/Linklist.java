package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linklist {

	public static void main(String[] args) {
		
		
		LinkedList ll= new LinkedList();
		
		ll.add("M1");
		ll.add(20);
		ll.addFirst(30);
		ll.addLast(40);
		//ll.remove();
		ll.removeFirst();
		ll.removeLast();
		//ll.set(2,500);
		
		//ll.addAll(arrList.al);
		ll.remove((Integer)20);
		
		for(Object e:ll){
			
			System.out.println(e);
		}
		System.out.println(ll.size());
	}

}
