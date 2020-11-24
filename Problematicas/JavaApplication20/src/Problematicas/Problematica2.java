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
public class Problematica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // TODO code application logic here
        //1. Inici
   
        // Declaro las variables
        int  contadorUno = 1;
        int  contadorDos = 10;
        int  contadorTres = 20;
        while (contadorUno <= 6) {            
            if ((contadorUno % 2) == 0){
           System.out.println(contadorUno + "/" + contadorTres);
            contadorTres = contadorTres + 1;
            }else{
            System.out.println(contadorUno + "/" + contadorDos);
            contadorDos = contadorDos + 1;
            }
            contadorUno= contadorUno + 1;
    }  
        
    }
    
}
