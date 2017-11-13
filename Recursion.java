/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.Scanner;

/**
 *
 * @author turbox
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give us your number: ");
        int x;
        x=sc.nextInt();
        System.out.println("The factorial is:" +factorial(x));
        System.out.println("The fibonacci is:" +fibonacci(x));
    }
    
    public static long factorial(int n){
        if ((n==1) || (n==0))
            return 1;
        return n *factorial(n-1);
        
    }
    
    public static int fibonacci(int n){
        if ((n==0)||(n==1))
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
                
    }

