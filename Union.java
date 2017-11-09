/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package union;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author turbox
 */
public class Union {

    /**
     * @param args the command line arguments
     */
    //Συνενώνει αριθμό και string και τα εκτυπώνει
    public static void main(String[] args) {
        int x;
        String a;
        Scanner input =new Scanner(System.in);
        
        
        System.out.println("Δώσε τον αριθμό");
        x=input.nextInt();
        System.out.println("Δώσε το string που θέλεις να εμφανίσεις");
        a=input.next();
        System.out.println(x+a);
        
    }

  

}
