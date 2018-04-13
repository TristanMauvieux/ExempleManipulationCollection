package fr.diginamic.ExempleManipulationCollection.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.diginamic.ExempleManipulationCollection.Classe.User;

public class Main {
	
	public static void main(String[] args) {

		List<User> users = new ArrayList<>();
		User utilisateurPremier = new User("Tristan", 22, true);
		User utilisateurDeuxieme = new User("Maria", 23, false);
		users.add(utilisateurDeuxieme);
		users.add(utilisateurPremier);
		/*
		 * tableau de nom pour la chaine.
		 */
		String[] tableauNom = {"Philipe","Anna","Hector","Elisa","Zarakai","Camille","Zehir","Angela","Arthur"};
		boolean genre = true;
		
		/*
		 * boucle pour créer dix utilisateur.
		 */
		for (int i = 0; i<tableauNom.length ; i++) {
			User u = new User(tableauNom[i], 20+i, genre );
			genre = !genre;
			users.add(u);
		}
		/*
		 * boucle pour afficher tous les utilisateurs de la liste Users
		 */
		User.afficherList(users);
		
		System.out.println("Hector ne fait plus parti de nos utilisateur nous allons le supprimer");
		
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getName().equals("Hector")) {
				users.remove(i);
			}
		}
		
		User.afficherList(users);
		/*
		 * permet de trier la list users par ordre alphabetique.
		 * Via la méthode compareTo
		 */
		Collections.sort(users);
		
		User.afficherList(users);
		
		
		//recupération d'un iterator pour affiché les utilisate
		

		User.afficherList(users);
		
		List<User> listUtilisateur = new ArrayList<>();
		listUtilisateur.add(new User(tableauNom[3]+"junior", 22, true) );
		listUtilisateur.add(new User(tableauNom[2]+"junior", 22, false) );
		listUtilisateur.add(new User(tableauNom[5]+"junior", 22, true) );
		listUtilisateur.add(new User(tableauNom[6]+"junior", 22, false) );

		users.addAll(listUtilisateur);
		
		User.afficherList(users);
	}

}
