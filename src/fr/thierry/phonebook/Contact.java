package fr.thierry.phonebook;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact extends PhoneDirectory {

	public Contact(String nom, String numero) {
		super();
		this.nom = nom;
		this.numero = numero;
	}
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}

	private String nom;
	private String numero;
	protected ArrayList<Contact> list = new ArrayList<Contact>();
	static Scanner scan = new Scanner(System.in);
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	public  void ajouterContact(Contact contact) {	
			list.add(contact);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Ajouter un nom");
		String name = scan.nextLine();
		System.out.println("Ajouter un numero");
		String number = scan.nextLine();
		Contact contact = new Contact(name,number);
		contact.ajouterContact(contact);
		System.out.println(contact.getNom()+ " " +contact.getNumero());
		
		scan.close();
		
		
	}




}
