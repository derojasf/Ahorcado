/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado2;

/**
 *
 * @author David
 */
public class Terminal {
    
    Lista mostrar=new Lista();
    Lista revpos=new Lista();
    Lista revl=new Lista();
    int x;
    char[]guiones;
    int suma1;
    int suma2;
    
    public void guion(){
        
        x=mostrar.palabras();
        guiones=new char[x];
        
        for(int i=0;i<x;i++){
            
           guiones[i]=95;
           System.out.println(guiones[i]);
           suma1=guiones[i];
        }
        
      
       
        
    }
   public void juego(){
     
       int g;
      char m;
      
      g=revpos.comparapos();
      m=revl.comparar();
     
      do{
          
      
      guiones[g]=m;
        
     
        for(int i=0;i<x;i++){
            
           
           System.out.println(guiones[i]);
           suma2=guiones[i];
        }
        }while(suma2!=suma1);
    } 
}
    
}
