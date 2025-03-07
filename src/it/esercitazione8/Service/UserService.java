package it.esercitazione8.Service;

import java.util.ArrayList;

import it.esercitazione8.Models.User;

public class UserService {

	public static void RegisterUser(ArrayList<User> users,User newUser) {
		if (newUser == null) {
			System.out.println("Errore: l'utente non può essere null.");
			return;
		}
		// Controllo se la mail è già presente nella lista
		for (User user : users) {
			if (user.getEmail().equalsIgnoreCase(newUser.getEmail())) {
				System.out.println("Errore: Un utente con l'email " + newUser.getEmail() + " esiste già.");
				return; // Esce dal metodo senza aggiungere l'utente
			}
		}
		// Se l'email non esiste, aggiungiamo l'utente alla lista
		users.add(newUser);
		System.out.println(newUser.toString());
	}
}
