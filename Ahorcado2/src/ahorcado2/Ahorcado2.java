/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado2;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Ahorcado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lista letra=new Lista();
        Terminal ter=new Terminal();
        Terminal sum1=new Terminal();
        Terminal sum2=new Terminal();
        int x,y;
        
        Scanner scan=new Scanner(System.in);
        
        x=sum1.suma1;
        y=sum2.suma2;
        
        ter.guion();
        do{
            letra.a=scan.next();
            
        }while(y!=x);
        
    }


}
