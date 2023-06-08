
package fr.thierry.phonebook;

import java.util.Scanner;
import java.util.List;

public class Contact {
	
	// attributs
	private String nom;
	private String numero;
	private static Scanner scanner = new Scanner(System.in);
	
	// getter nom
	public String getNom() {
		return nom;
	}
	
	// setter nom
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	// getter numero
	public String getNumero() {
		return numero;
	}
	
	// setter numero
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	// constructor surcharge
	public Contact() {
		super();
	}
	
	//constructor
	public Contact(String nom, String numero) {
		this.nom = nom;
		this.numero = numero;
	}

	// methode pour initialiser un objet Contact
	public static Contact ajouterContact(String nom, String numero) {
		Contact contact = new Contact(nom, numero);
		return contact;
	}
	
	public void showData(Contact contact) {
		System.out.println("Nom du contact = " + contact.getNom() + ", Telephone = " + contact.getNumero());
		System.out.println();
	}
	
	// methode ajouter des contacts
	public void nombreContact(List<Contact> list) {
		System.out.println("Indiquez le nombre de contacts :");
		// scanner permet de recuperer la saisie au clavier
		int count = scanner.nextInt();
		// controle savoir si count est un entier (int)
		if(count == (int) count) {
			try {
				scanner.nextLine(); // vider le tampon de la ligne précédente
				for (int i = 0; i < count; i++) { // boucle pour la saisie des noms et des nombres (names et numbers)
					System.out.println("Contact n°" + (i + 1)); // ligne "contact n°1"
					System.out.print("Saisir son nom : ");
					String name = scanner.nextLine().toLowerCase(); // toLowerCase transforme toutes les lettres en minuscule
					if (!name.isEmpty() && name.matches("^[a-zA-Z]*$")) { // controle pas vide et conforme aux lettres de l'alphabet
						System.out.print("Saisir son numéro : ");
						String number = scanner.nextLine();
						if (!number.isEmpty() && number.matches("^[0-9]*$")) { // controle si 10 chiffres telephone
							list.add(ajouterContact(name, number)); // <---- liste d'objets Contact ajout de contact.nom - contact.numero
						} else {
							System.out.println("Votre saisie n'est pas un numéro valide");
							i--;
						}
					} else {
						System.out.println("Votre saisie n'est pas une chaîne de caractères");
						i--;
					}
					System.out.println("----------------\n");

				}
			} catch (Exception e) {
				System.out.println("Votre saisie n'est pas un nombre valide");
			}
		}
	}
	
	public void supprimerContact(List<Contact> list) {
		 boolean contactASupprimer = false;
			System.out.println("Indiquez le nom de contact a supprimer: ");
			String nom= scanner.nextLine();
		
			if(!nom.isEmpty() && nom.matches("^[A-Za-z ]*$")) {
			// Parcourir la liste des contacts
			 for (int i=0; i<list.size();i++) {
				if (list.get(i).getNom().equalsIgnoreCase(nom)) {
					list.remove(i);
					contactASupprimer = true;
					break;
				}
				}
		}
			
			if (contactASupprimer != false) {
				
				System.out.println("Le contact '" + nom + "' a ete supprime.");
			} else {
				System.out.println("Le contact '" + nom + "' n'existe pas dans la liste.");
			}
		}
		public void rechercherContact(List<Contact>list) {
			boolean contactRechercher = false;
			String indexContact ="";
			System.out.println("Indiquez le nom de contact à rechercher");
			String nom = scanner.nextLine();
			
			if(!nom.isEmpty() && nom.matches("^[A-Za-z ]*$")) {
				//parcourir la liste des contacts
				for (int i=0; i<list.size();i++) {
					if (list.get(i).getNom().equalsIgnoreCase(nom)) {
						contactRechercher= true;
						indexContact=list.get(i).getNumero().toString();
						break;									
					}
				}
			}
			if (contactRechercher != false) {
				
				System.out.println("Le contact '" + nom + "' existe dans la liste. à l'index " + indexContact);
			} else {
				System.out.println("Le contact '" + nom + "' n'existe pas dans la liste.");
			}
		}
	

}
