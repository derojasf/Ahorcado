/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Lista {
    
    
    Random rnd = new Random();
    int a;
    int b;
    int pos;
    char l;
    String palabra;
    char cadena[];
    
public int palabras (){
    
 int x=0;
 x = (int)((rnd.nextDouble() * 5)+1);
    
    switch (x){
    
        case 1: palabra ="jeanne"; b=6; break;
        case 2: palabra ="zeus";b=4; break;
        case 3: palabra ="wallace";b=7; break;
        case 4: palabra ="nero";b=4; break;
        case 5: palabra ="sigfried";b=8; break;
        

            }
    
    cadena = palabra.toCharArray();
    return b;
      
    
    
}
 
public int comparapos(){
    
    for(int i=0;i<b;i++){
        if(a==cadena[i]){
            pos=i;
        }
        
    }
    return pos;
}
 
public char comparar(){
    
    for(int i=0;i<b;i++){
        if(a==cadena[i]){
            l=a;
        }
        
    }
    return l;
}


}
