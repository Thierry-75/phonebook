package fr.thierry.phonebook;

import java.util.ArrayList;
public class PhoneDirectory extends Contact {
	// constructor  
	public PhoneDirectory(ArrayList<Contact> list) {
		super();
		PhoneDirectory.list = list;
	}

	protected static ArrayList<Contact>list = new ArrayList<Contact>();
	// getter
	public ArrayList<Contact> getList() {
		return list;
	}
	// setter
	public void setList(ArrayList<Contact> list) {
		PhoneDirectory.list = list;
	}
	// constructor surcharge
	public PhoneDirectory() {
		super();
	}
	
	
	public static void main(String[] args) {
		Contact contact = new Contact();  // creation d'un objet Contact
		contact.nombreContact(list);  // appel de la methode nombreContact qui est dans la classe Contact
		scanner.close();

	}






	


}
