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
public class Nota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println ("Empezamos el programa");
        
        System.out.println ("Por favor introduzca el nombre de estudiante:");
        String nombre;
        Scanner entradaEscaner = new Scanner (System.in);
        nombre = entradaEscaner.nextLine();
        
        System.out.println ("Por favor introduzca la nota final del estudiante:");
        String nota;
        nota = entradaEscaner.nextLine(); 
        int Nota = Integer.parseInt(nota);
        
        if (Nota < 70){
            System.out.println ("El Estudiante "+nombre+" está: Reprobado");
        }else{
            System.out.println ("El Estudiante "+nombre+" está: Aprobado");
        }
        
    }
    
}
