/**
 * @author le by 6 - 19, 2017
 */
package main;

import java.util.*;

public class listdemo0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello list!");
		List<String> a = new LinkedList<>();
		a.add("Amy");
		a.add("Carl");
		a.add("Eric");
		
		List<String> b = new LinkedList<>();
		b.add("Bob");
		b.add("Doug");
		b.add("Frances");
		b.add("Gloria");
		
		ListIterator<String> aIter = a.listIterator();
		Iterator<String> bIter = b.iterator();
		
		while(bIter.hasNext()){
			if (aIter.hasNext()) {
				aIter.hasNext();
			}
			aIter.add(bIter.next());
		}
		
		System.out.println(a);
		
		bIter = b.iterator();
		while(bIter.hasNext()){
			bIter.next();
			if(bIter.hasNext()){
				bIter.next();
				bIter.remove();
			}
		}
		
		System.out.println(b);
		
		System.err.println(a);
	}

}
