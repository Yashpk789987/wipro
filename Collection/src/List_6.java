import java.text.DateFormatSymbols;
import java.util.Iterator;

import java.util.Vector;

public class List_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> monthsList = new Vector<String>();
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
		
		System.out.println();
		for(String month: monthsList) {
			System.out.println(month);
		}
	}

}
