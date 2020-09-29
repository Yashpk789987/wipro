package Set_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Reverse {

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
		List<String> list = new ArrayList<>(set);
		list.sort(Collections.reverseOrder());
		TreeSet<String> result = new TreeSet<>(list);

		it = result.iterator();
		System.out.println();
		System.out.println(result);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
