package fr.thierry.phonebook;

import java.util.ArrayList;
public class PhoneDirectory extends Contact {
	
	public PhoneDirectory(ArrayList<Contact> list) {
		super();
		PhoneDirectory.list = list;
	}

	protected static ArrayList<Contact>list = new ArrayList<Contact>();

	public ArrayList<Contact> getList() {
		return list;
	}

	public void setList(ArrayList<Contact> list) {
		PhoneDirectory.list = list;
	}
	
	
	public static void main(String[] args) {
		Contact contact = new Contact();
		contact.nombreContact(list);
		scanner.close();

	}





	


}
