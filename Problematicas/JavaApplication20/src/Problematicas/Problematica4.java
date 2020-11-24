/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problematicas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Elio Sivizaca
 */
public class Problematica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         entrada.useLocale(Locale.US);
        // TODO code application logic here
        
        int contador = 1;
        String nombreJugador;
        String cadenaFinal = "";
        double puntosAnotados;
        double faltasCometidas;
      
        while (contador <= 10) {            
        System.out.println("Ingrese el nombre del jugador: ");
        nombreJugador = entrada.nextLine();   
        System.out.println("Ingrese la cantidad de puntos que anotó en "
                           + "la temporada: ");
        puntosAnotados = entrada.nextInt();  
       
System.out.println("Ingrese la cantidad de faltas cometidas:");
        faltasCometidas = entrada.nextInt();
        cadenaFinal = String.format("%s%s\t%d\t%d\n",
        cadenaFinal,nombreJugador,puntosAnotados,faltasCometidas);
        contador = contador + 1;
        entrada.nextLine();
        }
       System.out.printf("%s\n", cadenaFinal);
    }
    
}
