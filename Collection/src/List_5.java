import java.text.DateFormatSymbols;

import java.util.Iterator;
import java.util.LinkedList;

public class List_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> monthsList = new LinkedList<String>();
		String[] months = new DateFormatSymbols().getMonths();
		for (int i = 0; i < months.length - 1; i++) {
			monthsList.add(months[i]);
		}
		System.out.println(monthsList.toString());
		System.out.println();
		Iterator<String> itr = monthsList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
