/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Ahoccado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lista letra=new Lista();
        Terminal ter=new Terminal();
        
        Scanner scan=new Scanner(System.in);
        
        
        ter.guion();
        
        letra.a=scan.nextInt();
    }
    
}
