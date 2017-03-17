/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Estudiantes
 */
public class Terminal {
    
    Lista mostrar=new Lista();
    Lista revpos=new Lista();
    Lista revl=new Lista();
    int x;
    
    
    public void guion(){
        
        x=mostrar.palabras();
        char[]guiones=new char[x];
        
        for(int i=0;i<x;i++){
            
           guiones[i]=95;
           System.out.println(guiones[i]);
        }
        
      int g;
      char m;
      g=revpos.comparapos();
      m=revl.comparar();
      
      guiones[g]=m;
        
        for(int i=0;i<x;i++){
            
           guiones[i]=95;
           System.out.println(guiones[i]);
       
        
    }
   
  
    } 
}
