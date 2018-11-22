
public class Voiture extends Vehicule {
	public int nombreDePlaces;
	public String listeDesPassagers;
	Voiture(String m, String i, String p, int a, int nbplaces, String lpas){
	  	super(m,i,p,a); //appel au constructeur de la classe mère
	  	nombreDePlaces=nbplaces;
	  	listeDesPassagers=lpas;
	}
	public void afficher(){
		super.afficher();
		System.out.println("nombres de places : "+nombreDePlaces+", liste des passagers : "+listeDesPassagers);
	}
}
