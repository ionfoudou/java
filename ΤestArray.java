/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package τestarray;

/**
 
 * 
 * 
 * @author turbox
 */
public class ΤestArray {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int i,j,k,sumi=0,sumj=0,sumk=0;
        int[][][] counts=new int [3][3][3];
    
         for (i = 0; i<counts.length; i++){
            for (j = 0; j<counts[i].length; j++){
                for (k =0; k < counts[i][j].length; k++){
                    counts[i][j][k] = i+j+k;
                    System.out.println("Counts["+i+"]["+j+"]["+k+"]: "+counts[i][j][k]);
                    sumk += counts[i][j][k];
                }
                sumj += counts[i][j][0];
            }
            sumi += counts[i][0][0];}
       System.out.printf("%d %d %d%n",sumi,sumj,sumk);
    }
