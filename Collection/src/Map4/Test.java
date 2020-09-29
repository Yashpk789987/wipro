package Map4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactList contactsList = new ContactList();

		contactsList.addContact("yash", 9399729);
		contactsList.addContact("vithlesh", 963088);
		contactsList.addContact("khushi", 91319139);

		System.out.println("yash: " + contactsList.doesContactNameExist("yash"));
		System.out.println("91319139: " + contactsList.doesContactNumberExist(91319139));

		System.out.println();
		contactsList.listAllContacts();
	}

}
