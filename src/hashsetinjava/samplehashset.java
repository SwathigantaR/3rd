package hashsetinjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class samplehashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet<>();
//		hs.add(30);
		hs.add(40);
		hs.add('v');
		hs.add("Hash");
		hs.add(null);
		System.out.println("hs = "+hs);
		
		
		LinkedList<String> l2=new LinkedList();
		l2.add("tom");
		l2.add("tonny");
		l2.add("Link");
		l2.add("tri");
		l2.add(null);
		l2.add("trip");
		System.out.println("l2 = "+l2);

		ArrayList<String> al2= new ArrayList<String> ();
		al2.add("tom");
		al2.add("amit");
		al2.add("sumit");
		al2.add("smart");
		al2.add("home");
		System.out.println("al2 = "+al2);
	//	System.out.println(hs);
		//System.out.println(hs.size());
		System.out.println(hs.addAll(al2));
		System.out.println(hs);
		hs.contains(al2);
		for(Object elements:hs) {
			System.out.println(elements);
			System.out.println(hs);
		}
	}

}
