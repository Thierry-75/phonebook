package fr.thierry.phonebook;

import java.util.Scanner;
import java.util.List;

public class Contact {

	private static String nom;
	private static String numero;
	static Scanner scanner = new Scanner(System.in);
	

	public String getNom() {
		return nom;
	}

	@SuppressWarnings("static-access")
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNumero() {
		return numero;
	}

	@SuppressWarnings("static-access")
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Contact() {
		super();
	}

	@SuppressWarnings("static-access")
	public Contact(String nom, String numero) {
		super();
		this.nom = nom;
		this.numero = numero;
	}

	public Contact ajouterContact(String nom, String nombre) {
		Contact contact = new Contact(nom, nombre);
		return contact;
	}

	public void nombreContact(List<Contact> list) {
		System.out.println("Indiquez le nombre de contact :");
		int count = scanner.nextInt();
		String[] names = new String[count];
		String[] numbers = new String[count];
		scanner.nextLine();
		int j = 0;
		for (int i = 0; i < count; i++) {
			System.out.println("Contact n°" + ++j);
			System.out.print("Saisir son nom : ");
			String name = scanner.nextLine();
			names[i] = name;
			System.out.print("Saisir son numéro : ");
			String number = scanner.nextLine();
			numbers[i] = number;
			System.out.println("----------------\n");

		}
		for (int k = 0; k < names.length; k++) {
			list.add(ajouterContact(names[k], numbers[k]));
			System.out.println(list.get(k).getNom() + " " + list.get(k).getNumero());
		}
	}
}
