package fr.thierry.phonebook;

import java.util.Scanner;
import java.util.List;

public class Contact {
	
	// attributs
	private static String nom;
	private static String numero;
	static Scanner scanner = new Scanner(System.in);
	
	// getter nom
	public String getNom() {
		return nom;
	}
	// setter nom
	@SuppressWarnings("static-access")
	public void setNom(String nom) {
		this.nom = nom;
	}
	// getter numero
	public String getNumero() {
		return numero;
	}
	//setter numero
	@SuppressWarnings("static-access")
	public void setNumero(String numero) {
		this.numero = numero;
	}
	// constructor surcharge
	public Contact() {
		super();
	}
	//constructor
	@SuppressWarnings("static-access")
	public Contact(String nom, String numero) {
		this.nom = nom;
		this.numero = numero;
	}

	// methode pour initialise un objet Contact
	public Contact ajouterContact(String nom, String nombre) {
		Contact contact = new Contact(nom, nombre);
		return contact;
	}
	
	// methode ajouter des contacts
	public void nombreContact(List<Contact> list) {
		System.out.println("Indiquez le nombre de contact :");
		// scanner permet de recuperer la saisie au clavier
		int count = scanner.nextInt();
		// controle savoir si count est un entier (int)
		if(count ==(int)count) {
			try {
				// creation tableaux de noms et de nombres
				String[] names = new String[count];
				String[] numbers = new String[count];
				scanner.nextLine();
				int j = 0;
				for (int i = 0; i < count; i++) { // boucle pour la saisie des noms et des nombres ( names et numbers)
					System.out.println("Contact n°" + ++j);   // ligne "contact n°1"
					System.out.print("Saisir son nom : ");
					String name = scanner.nextLine().toLowerCase();  // tolowerCase trasforme toutes les lettres en minuscule
					if (!name.isEmpty() && name.matches("^[a-z]*$") )  // controle pas vide et conforme aux lettres de l'alphabet
					names[i] = name;
					else {
						System.out.println("Votre saisie n'est pas une chaine de caractères");
					}
					System.out.print("Saisir son numéro : ");
					String number = scanner.nextLine().toLowerCase();
					if(!number.isEmpty() && number.matches("^[0-9]{10}*$")) { //controle si 10 chiffres telephone
					numbers[i] = number;}
					else {
						System.out.println("Votre saisie n'est pas une chaine de caractères");
					}
					System.out.println("----------------\n");

				}
				for (int k = 0; k < names.length; k++) {  // boucle for / taille du tableau names (names.length)
					list.add(ajouterContact(names[k], numbers[k]));  // <---- list d'objet Contact ajout de contact.nom - contact.numero
					System.out.println(list.get(k).getNom() + " " + list.get(k).getNumero());
				}
			} catch (Exception e) {
				System.out.println("Votre saisie n'est pas une valeur numériqe");
			}

		}
	}
}
