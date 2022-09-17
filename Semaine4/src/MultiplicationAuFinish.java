/**
 *
 * @author Vandeputte François
 *
 */
public class MultiplicationAuFinish {
	
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Entrainement aux multiplications. Voici une multiplication :");
		System.out.println("Tant que tu n'as pas trouve la bonne reponse, tu dois la recommencer! ");

		int premierNombre = unEntierAuHasardEntre(0, 10);
		int secondNombre = unEntierAuHasardEntre(0, 10);
		int reponseUtilisateur;
		System.out.println("Calculez : " + premierNombre + " x " + secondNombre + " = ");
		// A COMPLETER
		do {
			reponseUtilisateur = scanner.nextInt();
			if(reponseUtilisateur != premierNombre * secondNombre)
				System.out.println("C'est faux, recommence");
		}while(reponseUtilisateur != premierNombre * secondNombre);
		System.out.println("Bravo!");
	}

	// A NE PAS MODIFIER
	public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
		double nombreReel;
		int resultat;

		nombreReel = Math.random();
		resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
		return resultat;
	}
}
