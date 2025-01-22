// création de notre classe Matrice
// avec la méthode principale main
public class Matrice {
    public static void main(String[] args) {
        /* initialisation de la premiere et la deuxieme matrice */
        int matr1[][] = {
            {2,1,1,1},
            {1,2,1,1},
            {1,1,2,1},
            {1,1,1,2}
        };
        int matr2[][] = {
            {1,1,2,1},
            {1,5,1,1},
            {1,4,1,7},
            {1,1,6,9}
        };

        // l'Affichage de nos deux matrices initialiser si dessus
        System.out.print("La matrice numero 1 est: ");
        for (int i=0; i< matr1.length; i++){
            System.out.print("\n");
            for (int j=0; j<matr1[0].length; j++){
                System.out.print(matr1[i][j]+ " ");
            }
        }

        System.out.println("\n");
        System.out.print("La seconde matrice est: ");
        for (int i=0; i< matr2.length; i++){
            System.out.print("\n");
            for (int j=0; j<matr2[0].length; j++){
                System.out.print(matr2[i][j]+ " ");
            }
        }

        /*creation deux nouvelles variables portant le nombre des
        et des colomnes initialiser a partir de la seconde matrice
         */
        int lgn = matr2.length;
        int clm = matr2[0].length;

        /* creation d'un nouveau Tableau qui serra par la suite la  
        la transposee de notre matrice
        */
        int[][] matriceT = new int[lgn][clm];

        // boucle pour creer la transposee
        // boucle pour Affichage de la transposee
        for (int i=0; i<lgn; i++){
            for (int j=0; j< clm; j++) {
                matriceT[j][i] = matr2[i][j];
            }
        }
        System.out.print("\n");
        System.out.print("Et voila la matrice transposer du second matrice: ");
        for (int j=0; j<clm; j++){
            System.out.print("\n");
            for (int i=0; i< lgn; i++) {
                System.out.print(matriceT[j][i] + " ");
            }
        }

        /* creation d'une nouvelle variable Tableau qui va
        stocker le resultat du produit de nos deux matrice
        la premiere et la transposee de la seconde matrice
        */
        int[][] resuProd = new int[lgn][lgn];

        // Boucle pour calculer le produit de deux matrices
        // et affichage d'un resultat final
        for (int i=0; i<lgn; i++){
            for (int j= 0; j<clm; j++){
                for (int v =0 ; v <lgn; v++) {
                    resuProd[i][j] += matr1[i][v] * matriceT[v][j];
                }
            }
        }
        System.out.print("\n");
        System.out.println("Le produit(le resultat)\n de la premiere matrice avec la transposee du second est:");
        for (int i=0; i< lgn; i++) {
            System.out.print("\n");
            for(int j=0; j< clm; j++){
                System.out.print(resuProd[i][j] + " ");
            }
        }
    }
}
