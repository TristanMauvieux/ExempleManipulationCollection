package fr.diginamic.ExempleManipulationCollection.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import fr.diginamic.ExempleManipulationCollection.Classe.User;

public class Main {
	
	public static void main(String[] args) {

		List<User> users = new ArrayList<>();
		User utilisateurPremier = new User("Tristan", 22, true);
		User utilisateurDeuxieme = new User("Maria", 23, false);
		users.add(utilisateurDeuxieme);
		users.add(utilisateurPremier);
		/**
		 * tableau de nom pour la chaine.
		 */
		String[] tableauNom = {"Philipe","Anna","Hector","Elisa","Zarakai","Camille","Zehir","Angela","Arthur"};
		boolean genre = true;
		
		/**
		 * boucle pour créer dix utilisateur.
		 */
		for (int i = 0; i<tableauNom.length ; i++) {
			User u = new User(tableauNom[i], 20+i, genre );
			genre = !genre;
			users.add(u);
		}
		/**
		 * boucle pour afficher tous les utilisateurs de la liste Users
		 */
		utilisateurPremier.afficherList(users);
		
		System.out.println("Hector ne fait plus parti de nos utilisateur nous allons le supprimer");
		
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getName().equals("Hector")) {
				users.remove(i);
			}
		}
		
		utilisateurPremier.afficherList(users);
		
		Collections.sort(users);
		
		utilisateurPremier.afficherList(users);
		
	}

}
