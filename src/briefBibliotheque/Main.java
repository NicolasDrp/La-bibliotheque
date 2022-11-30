package briefBibliotheque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Titre du livre");
		String titre = scan.nextLine();
		System.out.println("Nom de l'auteur");
		String nom = scan.nextLine();
		System.out.println("Genre du livre");
		String genre = scan.nextLine();
		System.out.println("Nombre de pages");
		int pages = scan.nextInt();
		System.out.println("Nombre d'exemplaire");
		int exemplaire = scan.nextInt();
		
		Livre livre = new Livre(titre, nom, genre, pages, exemplaire);
		Bibliotheque liste = new Bibliotheque(livre);
		System.out.println(livre.info());
		liste.creer();
		liste.creer();
		System.out.println(liste.getListe().size());

		
		
		
		scan.close();
	}
}
