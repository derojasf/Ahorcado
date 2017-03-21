/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado2;

import java.util.Random;

/**
 *
 * @author David
 */
public class Lista {
    Random rnd = new Random();
    String a;
    int b;
    int pos;
    char l;
    String palabra;
    char cadena[];
    char ca[];
    
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
    
    ca=a.toCharArray();
    
    for(int i=0;i<b;i++){
        if(ca[i]==cadena[i]){
            pos=i;
        }
        
    }
    return pos;
}
 
public char comparar(){
    
    for(int i=0;i<b;i++){
        if(ca[i]==cadena[i]){
            l=ca[i];
        }
        
    }
    return l;
}
}
