package fr.welc.phonebook;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneDirectory {

	private ArrayList<Contact> list; // Liste des contacts du répertoire téléphonique
	private Scanner scanner;

	public static void main(String[] args) {
		PhoneDirectory phoneDirectory = new PhoneDirectory();
		phoneDirectory.run();
	}

	public PhoneDirectory() {
		this.list = new ArrayList<>();
		this.scanner = new Scanner(System.in);
	}

	public void run() {
		Contact contact = new Contact();

		System.out.println("Voulez-vous démarrer le programme ? (o/n)");
		String choix = scanner.nextLine();
		while (choix.equalsIgnoreCase("o")) {

			affichageMenu();
			int numero = scanner.nextInt();
			scanner.nextLine(); // Vider le tampon après avoir lu un entier

			switch (numero) {
			case 1:
				contact.nombreContact(list);
				break;
			case 2:
				contact.rechercherContact(list);
				break;
			case 3:
				afficherContacts(list);
				break;
			case 4:
				contact.supprimerContact(list);
				break;
			case 5:
				contact.quitterContact();
				System.out.println("Au revoir");
				scanner.close();
				return;
			default:
				contact.defaultContact();
				System.out.println("Au revoir");
				scanner.close();
				return;
			}
		}

		System.out.println("Au revoir !!!");
		scanner.close();
	}

	public void affichageMenu() {
		System.out.println("\n********* MENU **********");
		System.out.println("Choisissez une option");
		System.out.println("1. Ajouter un contact");
		System.out.println("2. Rechercher un contact");
		System.out.println("3. Afficher tous les contacts");
		System.out.println("4. Supprimer un contact");
		System.out.println("5. Quitter \n");
	}

	public void afficherContacts(ArrayList<Contact> list) {
		for (Contact contact : list) {
			System.out.println("Nom : " + contact.getNom() + ", Numéro : " + contact.getNumero());
		}
	}
}
