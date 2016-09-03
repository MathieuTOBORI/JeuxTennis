package org.entretien;

import java.util.Scanner;

/**
 * @author TOBORI
 *
 */
/**
 * @author TOBORI
 *
 */
public class Joueur {

	// Les attributs
	private String nom;
	private int score;

	// Les Constructeurs

	public Joueur() {
		super();
	}

	public Joueur(String nom, int score) {
		super();
		this.nom = nom;
		this.score = score;
	}

	// Les setters et les getters

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// Ajouter un point chaque fois le joueur gagne
	public int gagnerUnPoint(int score) {
		this.score = getScore() + 15;
		System.out.println("Il a un score de : " + this.score);
		return this.score;

	}

	public void affiche() {
		System.out.println("Le joueur gagnant " + getNom() + " son score est : " + getScore());
	}


	@Override
	public String toString() {
		return "Joueur [nom=" + nom + ", score=" + score + "]";
	}

}
