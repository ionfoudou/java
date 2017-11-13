/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplejavaapplication;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author turbox
 */
public class SimpleJavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner sc=new Scanner(System.in);
        System.out.println("What's your name,your surname and your father's name? ");
        String name = sc.nextLine();
        String surname=sc.nextLine();
        String fathername=sc.nextLine();
        System.out.println("Your date of birth? (DD/MM/YYYY) ");
        String dateofbirth=sc.nextLine();
        
        
        sc.close();
        String fileName = surname + "." + name + ".txt";
        
        String Year =dateofbirth.substring(6,10 );
        int age= 2017-Integer.parseInt(Year);
         
        try{
        PrintWriter writer=new PrintWriter("fileName","UTF-8" );
         writer.println("Line 1 :" +name+ "," +surname+ "," +fathername );
         writer.println("Line 2 :" +dateofbirth);
         writer.println("Line 3 :" +age );
         writer.close();
         System.out.println("file is ready");
        
         }catch (FileNotFoundException ex) {
                Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            
        
        
        
                 
        
    }
    
}
