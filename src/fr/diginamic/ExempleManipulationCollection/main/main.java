package fr.diginamic.ExempleManipulationCollection.main;

import java.util.ArrayList;

import fr.diginamic.ExempleManipulationCollection.Classe.User;

public class main {

	public static void main(String[] args) {

		ArrayList<User> users = new ArrayList<>();
		User utilisateurPremier = new User("Tristan", 22, true);
		User utilisateurDeuxieme = new User("Maria", 23, false);
		users.add(utilisateurDeuxieme);
		users.add(utilisateurPremier);
		boolean genre = false;
		
		/**
		 * boucle pour créer dix utilisateur.
		 */
		for (int i = 0; i < 10; i++) {
			User u = new User("Utilisateur"+i, 25+i, genre );
			genre = !genre;
			users.add(u);
		}
		/**
		 * boucle pour afficher tous les utilisateurs de la liste Users
		 */
		for (int i = 0; i < users.size(); i++) {
			User utilisateur = users.get(i);
			System.out.println(utilisateur.toString());
		}
	}

}
