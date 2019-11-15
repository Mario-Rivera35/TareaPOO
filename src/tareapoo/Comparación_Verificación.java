/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapoo;

/**
 *
 * @author Mario Santos
 */
public class Comparación_Verificación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int M = 6, T = 1, K = -10;
        
        System.out.println("Comparación entre M y T");
        
        if(M>T){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }
        
        System.out.println("Verificación de T / K == -5");
        
        if(T / K == -5){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }        
        
        System.out.println("Verificación de (M+T == 7) || (M-T == 5)");
        
        if((M+T == 7) || (M-T == 5)){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        } 
        
    }
    
}
