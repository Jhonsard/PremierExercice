//1. Importation des bibliothéques nécessaires
import java.util.Scanner;

//2. Déclaration de la classe principale
public class NomDelaClasse{
    //3. Méthodes principales (point d'entrée du programme)
    public static void main(String[] args) {
        // Déclaration des variables
        int nbr1, nbr2, nbr3;

        // Saisie Utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.print("svp, entrer le premier nombre: ");
        nbr1 = scanner.nextInt();
        System.out.print("svp, entrer le deuxième nombre: ");
        nbr2 = scanner.nextInt();
        System.out.print("svp, entrer le deuxième nombre: ");
        nbr3 = scanner.nextInt();

        //Appel des méthodes pour effectuer les calculs
        int somme = addition(nbr1, nbr2, nbr3);

        //Affichage des résultats
        System.out.println("La somme est: "+ somme);
    }

//4. Méthodes supplémentaires pour modularité
public static int addition(int a, int b, int c){
    return a + b * c;
}
}