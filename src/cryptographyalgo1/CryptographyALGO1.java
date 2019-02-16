/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographyalgo1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CryptographyALGO1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
     String k = "";
      FileReader fr; 
      String s= "C:\\Users\\dell\\Documents\\NetBeansProjects\\CryptographyALGO1\\src\\cryptographyalgo1\\Plaintext.txt";
 BufferedReader br=new BufferedReader(new FileReader(s) );
String h=br.readLine();
String w[]=h.split("");

char a=(char)97;
      incripORDecrip a1=new incripORDecrip();
     a1.func(4);
      
        for (int i = 0; i < w.length; i++) {
            if(w[i]==null){
                
            }else{
                for (int j = 0; j < a1.l.size(); j++) {
                        if(a1.l.get(j).n.equals(w[i])){
                            k=k+a1.l.get(j).m;
                            break;
                        }
                }
                    
                    }
                }
        System.out.println();
        System.out.println(k);
               String   w1[]=k.split("");
                  k="";
                  for (int i = 0; i < w1.length; i++) {
            
        
                   for (int j = 0; j < a1.l.size(); j++) {
                        if(a1.l.get(j).m.equals(w1[i])){
                            k=k+a1.l.get(j).n;
                            break;
                        }
                }
               
                }
        System.out.println("\n"+k);
    }
}
            
        
 
      
        
    
    
    

