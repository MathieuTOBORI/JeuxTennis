package lanceur;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.entretien.Joueur;

public class ClassePrincipale {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Joueur joueur1 = new Joueur("Djokovic", 0);
		Joueur joueur2 = new Joueur("MacEnroe", 0);
		System.out.println(
				"                    **************************************************************            ");
		System.out.println("Debut du jeux");
		System.out.println("Les joueurs sont: \n" + "- " + joueur1 + "\n" + "- " + joueur2);
		// Ouverture d'un fichier de log

		File resultat = new File("Resultat.txt");
		FileWriter fw = new FileWriter(resultat);
		fw.write( "******************* Debut du jeu***************************");

		// Lire les entrer du clavier
		Scanner jeux = new Scanner(System.in);

		while ((joueur1.getScore() < 45 && joueur2.getScore() < 45)
				|| (joueur1.getScore() == 45 && joueur2.getScore() == 30)
				|| (joueur2.getScore() == 45 && joueur1.getScore() == 30)) {

			System.out.println("**********  Saisissez le nom joueur qui a gagné le point: **********");
			String nomJoueurSaisit = jeux.nextLine();

			System.out.println("le joueur est : " + nomJoueurSaisit);
			if (nomJoueurSaisit.equals("Djokovic")) {
				joueur1.gagnerUnPoint(joueur1.getScore());
				fw.write(joueur1.getNom() + " " + joueur1.getScore() + "\n");
				fw.flush();

			} else if (nomJoueurSaisit.equals("MacEnroe")) {
				joueur2.gagnerUnPoint(joueur2.getScore());
				fw.write(joueur2.getNom() + " " + joueur2.getScore() + "\n");
				// Forçage de l'écriture
				fw.flush();
			} else
				System.out.println("Le nom du joeur n'existe : " + nomJoueurSaisit);

		}

		if (joueur1.getScore() == 45 && joueur2.getScore() == 45) {

			System.out.println("Le résultat final du jeux est : ");

			fw.write("les deux joueurs sont à égalités : " + "Score de Djokovic " + joueur1.getScore() + "\n"
					+ "Score de MacEnroe " + joueur2.getScore() + "\n");
			fw.flush();

			System.out.println("Saisissez le joueur qui a gagné : ");
			String nomJoueurSaisit = jeux.nextLine();
			if (nomJoueurSaisit.equals("Djokovic")) {

				joueur1.gagnerUnPoint(joueur1.getScore());

				fw.write(joueur1.getNom() + " " + joueur1.getScore());
				// Forçage de l'écriture
				fw.flush();

			} else if (nomJoueurSaisit.equals("MacEnroe")) {
				joueur2.gagnerUnPoint(joueur2.getScore());

				fw.write(joueur2.getNom() + " " + joueur2.getScore());
				// Forçage de l'écriture
				fw.flush();

			}

		} else if ((joueur1.getScore() == 45 && joueur2.getScore() < 30)
				|| (joueur2.getScore() == 45 && joueur1.getScore() < 30)
				|| (joueur1.getScore() == 60 && joueur2.getScore() == 30)
				|| (joueur2.getScore() == 60 && joueur1.getScore() == 30))

		{
			// fw.write(joueur1.getNom()+" "+joueur1.getScore());
			// fw.write(joueur2.getNom()+" "+joueur2.getScore());
			//// Forçage de l'écriture
			// fw.flush();

		}

		System.out.println("Le resultat du jeu est : ");
		joueur1.affiche();
		joueur2.affiche();

		System.out.println("************* ************** Fin du jeu*******************************************");
		
		fw.write("************* ************** Fin du jeu*******************************************");
		fw.close();
	}

}
