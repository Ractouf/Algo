import java.util.Scanner;

public class Lecture5Entiers {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int somme = 0;
        for (int i = 1; i <= 5 ; i++) {
            System.out.print("Entrez l'entier n°"+i+" : ");
            int entier = scanner.nextInt();
            somme = somme + entier;
        }
        System.out.println("La somme est " + somme);
    }
}
