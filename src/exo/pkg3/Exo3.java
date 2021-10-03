/**
 * Exo 3, Ervan ROUX,29/09/21, Calculator  *
 *
 */
package exo.pkg3;

import java.util.Scanner;

/**
 *
 * @author utilisateur
 */
public class Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //déclaration des variables 
        int operateur;
        int operande1;
        int operande2;
        int res;
        System.out.println("Please enter the operator:");
        System.out.println("1) add\n" + "2) substract\n" + "3) multiply\n" + "4) divide\n" + "5) modulo");
        Scanner sc = new Scanner(System.in);
        operateur = sc.nextInt();
        //test des indices
        if (operateur<1||operateur>5){
            System.out.println("Veuillez saisir un chiffre entre 0 et 6");
            System.exit(0);
            }
        //demande de saisie de l'utilisateur
        System.out.println("Entrer une première valeur");
        operande1 = sc.nextInt();
        System.out.println("Entrer une deuxième valeur");
        operande2 = sc.nextInt();
        res=0;

        //Boucle if
        switch (operateur) {
            case 1:
                res = operande1 + operande2;
                break;
            case 2:
                res = operande1 - operande2;
                break;
            case 3:
                res = operande1 * operande2;
                break;
            case 4:
                res = operande1 / operande2;
                break;
            case 5:
                res = operande1 % operande2;
                break;
            default :
                System.err.println("erreur de saisie");
                break; 
        }
        //Affichage du résultat

        System.out.println(res);

    }   

}


