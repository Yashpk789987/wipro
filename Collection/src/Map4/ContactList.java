package Map4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ContactList {
	HashMap<String, Integer> contacts = new HashMap<>();
	
	public void addContact(String name, Integer number) {
		contacts.put(name, number);
	}
	
	public void removeContact(String name) {
		contacts.remove(name);
	}

	@Override
	public String toString() {
		return "ContactList [contacts=" + contacts + "]";
	}
	
	public boolean doesContactNameExist(String searchname) {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();
			
			if (me.getKey().equals(searchname)) {
				return true;
			}
		}
		
		return false;
//		boolean found = false;
//		contacts.forEach((name, number) -> {
//			if(name.equals(searchname)) {
//				found = true;
//			}
//		});
//		return found;
	}
	
	public boolean doesContactNumberExist(Integer number) {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();

			//System.out.println(me.getValue() + " == " + number + " :: " + (me.getValue() == number));
			if (me.getValue().intValue() == number) {
				
				return true;
			}
		}
		
		return false;
	}
	
	public void listAllContacts() {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();
			System.out.println(me);
		}

	}
}