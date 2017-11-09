/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control3numbers;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author turbox
 */
public class Control3numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Scanner input =new Scanner(System.in);
        System.out.println("Δώσε τον πρώτο αριθμό:");
        x=input.nextInt();
        System.out.println("Δώσε τον δεύτερο αριθμό:");
        y=input.nextInt();
        System.out.println("Δώσε τον τρίτο αριμοό:");
        z=input.nextInt();
        while ((y<3*x) || (z<=(x+y))){
        System.out.println("Λάθος στοιχεια");
        System.out.println("Δώσε τον πρώτο αριθμό: ");
        x=input.nextInt();
        System.out.println("Δώσε τον δεύτερο αριθμό: ");
        y=input.nextInt();
        System.out.println("Δώσε τον τρίτο αριμοό : ");
        z=input.nextInt();}
        System.out.println("Μπράβο,Έγκυρα στοιχεια : ");
        
    }
        
    

  
    
}
