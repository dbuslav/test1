/*
* TPO Exercice 1
* BUSLAVSKAIA JULIEN 
* TDB 2A 
* 23 septembre 2020
*/
package exo1;

import java.util.Scanner;

/**
 *
 * @author daria
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*System.out.println( " Bonjour " ) ;
        */
        String prenom;
        Scanner sc ;
        sc = new Scanner (System.in) ; 
        System.out.println("Quel est votre prénom ?"); 
        prenom = sc.nextLine();
        System.out.println("Bonjour "+prenom); 
    }
    
}
