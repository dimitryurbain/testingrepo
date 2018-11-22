
public class Test {

	public static void main(String[] args) {
		//variables personne
		String m="Audi";
		String i="255-AR-59";
		String p="Bruce Lee";
		int a=2014;
		int nbplaces=2;
		String lpas="Marc, Jean";
		Voiture a1=new Voiture(m,i,p,a,nbplaces,lpas);
		a1.afficher();
	}

}
