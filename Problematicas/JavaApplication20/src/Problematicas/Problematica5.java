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
public class Problematica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         entrada.useLocale(Locale.US);
        // TODO code application logic here
        int  contador = 1;
        double promedioCiclo;
        String cadenaFinal = "";
        String estado;
        String nombreEstudiante;
        while (contador <= 4) {            
           System.out.println("Ingrese el nombre del estudiante: ");
            nombreEstudiante = entrada.nextLine();
            System.out.println("Ingrese el promedio de ciclo: ");
            promedioCiclo = entrada.nextDouble();  
            if (promedioCiclo >=7){
                estado ="Aprobado" ; 
      
}else{
                estado ="Reprobado" ;}
        cadenaFinal = String.format("%s%s\t%.2f\t%s\t\n",
        cadenaFinal,
        nombreEstudiante,
        promedioCiclo,
        estado);
          contador = contador + 1;   
        entrada.nextLine();
        }
     System.out.printf("%s\n", cadenaFinal);
    }  
}
    
    

