package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;

	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier", Unite.Kilogramme);
		this.poids = poids;
		this.chasseur = chasseur;
	}

	public String description() {
		return nom + " de " + poids + " " + unite.getUnite() + " chasse par " + chasseur.getNom() + " .\n";
	}

}
