package Set_3;

import java.util.Iterator;
import java.util.TreeSet;

public class Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<>();
		set.add("Yash");
		set.add("khushi");
		set.add("Vithlesh");
		set.add("Aditya");
		System.out.println(set);
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
