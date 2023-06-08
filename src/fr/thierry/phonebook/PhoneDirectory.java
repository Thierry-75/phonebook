package fr.thierry.phonebook;


import java.util.ArrayList;
import java.util.Scanner;

public class PhoneDirectory {
	
	private static ArrayList<Contact> list = new ArrayList<>(); // Liste des contacts du répertoire téléphonique

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Contact contact = new Contact(); // Création d'un objet Contact pour gérer les contacts
		contact.nombreContact(list); // Appel de la méthode pour ajouter des contacts dans la liste
		
		PhoneDirectory phoneDirectory = new PhoneDirectory(list); // Création d'un objet PhoneDirectory pour gérer le répertoire téléphonique
		phoneDirectory.afficherContacts(); // Appel de la méthode pour afficher les contacts du répertoire
		contact.supprimerContact(list);
		phoneDirectory.afficherContacts();
		contact.rechercherContact(list);
		phoneDirectory.afficherContacts();
		scanner.close(); // Fermeture du scanner
	}
	
	
	public PhoneDirectory(ArrayList<Contact> list) {
		this.list = list;
	}
	
	public ArrayList<Contact> getList() {
		return list;
	}
	
	
	public void setList(ArrayList<Contact> list) {
		this.list = list;
	}
	
	public void afficherContacts() {
		for (Contact contact : list) {
			System.out.println("Nom : " + contact.getNom() + ", Numéro : " + contact.getNumero());
		}
	}
}