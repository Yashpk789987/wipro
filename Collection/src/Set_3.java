import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Set_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet<String> set = new TreeSet<>();
		Collection<String> set = new TreeSet<>(Collections.reverseOrder());
		set.add("Yash");
		set.add("khushi");
		set.add("Vithlesh");
		set.add("Aditya");
		
		Iterator<String> it = set.iterator();
		String query = "Yash";
		boolean result = false;
		
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");
	}

}
