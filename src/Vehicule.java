
public class Vehicule {
	protected String marque;
	protected String immatriculation;
	protected String proprietaire;
	protected int annee;
	// constructeur d initialisation
	Vehicule(String m, String i, String p, int a){
		marque=m;
		immatriculation=i;
		proprietaire=p;
		annee=a;
	}
	// procedure d affichage
	public void afficher(){
		System.out.println("marque : "+marque+", immatriculation : "+immatriculation+", proprietaire : "+proprietaire+", annee : "+annee);
		}
}
