package briefBibliotheque;

import java.util.ArrayList;

public class Bibliotheque {

	private ArrayList<Livre> liste = new ArrayList<Livre>();
	private Livre livre;

	public Bibliotheque(Livre livre) {
		this.livre = livre;
	}

	//methode pour ajouter un livre 
	public void creer() {
		liste.add(livre);
	}
	
	//prendre un livre dans la liste
	public Livre sortir() {
		return livre;
	}
	
	
	
	
	//getter et setter
	public ArrayList<Livre> getListe() {
		return liste;
	}

	public void setListe(ArrayList<Livre> liste) {
		this.liste = liste;
	}

	
	
	
	
	
}
