/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographyalgo1;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class incripORDecrip {
    String n,m;

    @Override
    public String toString() {
        return "incripORDecrip{" + "n=" + n + ", m=" + m + ", l=" + l + '}';
    }

    
    
ArrayList<incripORDecrip> l=new ArrayList();
incripORDecrip p;
        public incripORDecrip() {
         this.n = n;
        this.m = m;
        }
    
    public incripORDecrip(String n, String m) {
        this.n = n;
        this.m = m;
    }
      String ac[] =new String[30];
       String ab[] = new String[30];
       

           
   public void func(int v){
       char a=(char)97;
       char b=(char)65;
    
       for (int i = 0; i < 26; i++) {
     ac[i]=(Character.toString(a));
     a++;
       }
       a=(char)97;
       for (int i = v; i < 26; i++) {
           ab[i]=(Character.toString(a));
           a++;
       }
       for (int i = 0; i < v; i++) {
           ab[i]=(Character.toString(a));
           a++;
       }
       
       
       for (int i = 0; i < 26; i++) {
          
           p=new incripORDecrip(ac[i],ab[i]);
         l.add(p);
       
       System.out.print(ac[i]);
           
   }
       System.out.println();
       for (int i = 0; i < 26; i++) {
                  System.out.print(ab[i]);

       }
   }
}
