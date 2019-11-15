/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapoo;

import java.util.Scanner;

/**
 *
 * @author Mario Santos
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int suma;
        int resta;
        int mult;
        int div;
        int mod;
        
        System.out.println ("Empezamos el programa");
        
        System.out.println ("Por favor introduzca el primer numero:");
        String n1;
        Scanner entradaEscaner = new Scanner (System.in);
        n1 = entradaEscaner.nextLine(); 
        int N1 = Integer.parseInt(n1);
        
        System.out.println ("Por favor introduzca el segundo numero:");
        String n2;
        n2 = entradaEscaner.nextLine(); 
        int N2 = Integer.parseInt(n2);
        
        suma = N1 + N2;
        resta = N1 - N2;
        mult = N1 * N2;
        div = N1 / N2;
        mod = N1 % N2;
        
        System.out.println ("La suma de "+N1+" y "+N2+" es: "+suma+"");
        System.out.println ("La resta de "+N1+" y "+N2+" es: "+resta+"");
        System.out.println ("La multiplicación de "+N1+" y "+N2+" es: "+mult+"");
        System.out.println ("La división entre "+N1+" y "+N2+" es: "+div+"");
        System.out.println ("El mod entre "+N1+" y "+N2+" es: "+mod+"");
        
    }
    
}
