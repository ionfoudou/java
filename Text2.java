/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text2;

/**
 *
 * @author turbox
 */
public class Text2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StringBuilder buffer1=new StringBuilder();
       buffer1.append("00lel00l0");
       System.out.println(findLastChar(buffer1,'l'));
       
        
       
  }
     public static int findLastChar(StringBuilder buf,char c ){
        System.out.println( buf.reverse());   
            boolean find=false;
            int i=0;
            do{
                if((buf.indexOf("l"))!=i)
                  i=i+1;
                else
                   find=true;
            }while(!find);
            return(buf.length()-i-1);
     }
    
}
