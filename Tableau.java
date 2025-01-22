/* 
importation de la fonction scanner qui stocque les données entrées
 */
import java.util.Scanner;

// création de notre classe
// avec la méthode principale
public class Tableau{
    public static void main(String[] args) {

        Scanner entrer = new Scanner(System.in);

        // Initialisation de notre tableau de 4X5 dimension
        int Tabelmts[][]={
                {1,12,5,15,17},
                {1,2,3,0,6},
                {0,18,23,4,5},
                {1,3,19,45,100}};

        // création d'une saisie pour notre utilisateur
        System.out.print("Entrer le nombre entier que vous voulez verifier svp!: ");
        int newelmts = entrer.nextInt();
        
        // Affichage des éléments de notre tableau initial
        System.out.print("\n");
        System.out.println("Voici les éléments de notre tableau: ");
        for (int i=0; i<Tabelmts.length; i++){
            System.out.print("\n|");
            for (int j=0; j < Tabelmts[0].length; j++){
                System.out.print(Tabelmts[i][j]+" ");
            }
        }
        
            // verification du chiffre entrer par l'utilisateur
            // s'il existe ou pas dans le tableau initial
            // Avec l'affichage d'une reponse finale.
            boolean existe = false;
            for (int i=0; i < Tabelmts.length; i++){
                for (int j =0; j<Tabelmts[i].length; j++){
                    if (Tabelmts[i][j] == newelmts){
                        existe = true;
                        break;
                    }
                }
                if (existe){
                    break;
                }
            }
            if(existe){
                System.out.print("\n");
                System.out.print("\n");
                System.out.println("L'élément "+newelmts+" est dans notre tableau");
            } else{
                System.out.print("\n");
                System.out.println("L'élément "+newelmts+" n'est pas dans notre tableau");
            }
        }
    }