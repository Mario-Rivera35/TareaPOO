/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapoo;

import javax.swing.JOptionPane;

/**
 *
 * @author Mario Santos
 */
public class Arreglo_Informativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String [][] personas ={  {"Luz     ","Espinoza", "   Ing. en Producción Industrial", "   N/A"},
                                 {"Walter  ","Sanchez", "    Ing. en Computación", "             N/A"},
                                 {"Aylin   ","Funez", "      Ing. en Computación","             N/A"},
                                 {"Dunia   ","Hernández", "  Ing. en Producción Industrial", "   N/A"},
                                 {"Delbert ","Lira", "       Ing. en Computación", "             N/A"},
                          };
    
        String ax="";
    
        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                ax+= personas[i][j];
            }
            ax+="\n";
        }
    
        System.out.println(ax);

    }
    
}
