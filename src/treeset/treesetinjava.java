package treeset;
import java.util.HashSet;
import java.util.TreeSet;

public class treesetinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts= new TreeSet<>();
		ts.add(20);
// 		ts.add(20);
		ts.add(30);
		ts.add(50);//here treeSet is not heterogeneous 
					//TreeSet is homogeneous and no duplicates
		System.out.println(ts);
		TreeSet ts1=new TreeSet <>();
		ts1.add("Swathi");
		ts1.add("Asha");
		ts1.add("Sravnathi");
		ts1.add("Yamini");
		
		HashSet hs=new HashSet<>();
		hs.add(30);
		hs.add(40);
		hs.add('v');
		hs.add("Asha");
		hs.add(null);
		
		System.out.println(ts1);
		System.out.println(ts1.first());
	System.out.println(ts.retainAll(hs));//it will print true or false and  compare and remove all different elements from treeset
	System.out.println(ts.pollFirst());//print and remove first element
//ystem.out.println(ts.);
	//		for(Object elements:ts1) {
//			System.out.println(elements);
//		}
	}

}
