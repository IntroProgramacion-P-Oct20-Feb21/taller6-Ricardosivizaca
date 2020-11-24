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
public class Problematica1 {

    /**
     * @param args the command line arguments
     */
    //1. Inicio
    public static void main(String[] args) {
        //2. Declaro las variables
        String nombre;
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double netflix= 10;
        double disney= 6;
        double apple= 5;
        double amazon= 4.5;
        int mensualidades;
        int numero;
        String resultadofinal = ""; 
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("indique el numero de mensualidades "
                + "(ingrese minimo 2):  ");
        mensualidades= entrada.nextInt();
        
        if (mensualidades >= 2 ) {
        System.out.println("indique que servicio de stream decea\n"
                + "Ingresar 1 para escoger netflix\n"
                + "Ingresar 2 para escoger disney\n"
                + "Ingresar 3 para escoger apple\n"
                + "Ingresar 4 para escoger amazon\n");
        numero = entrada.nextInt();
 
       double mensualidadNetflix = mensualidades * netflix;
       double mensualidadDisney = mensualidades * disney;
       double mensualidadApple = mensualidades * apple;
       double mensualidadAmazon = mensualidades * amazon;
       double ivaNetflix = mensualidadNetflix * 0.1;
       double ivaDisney = mensualidadDisney * 0.12;
       double ivaApple = mensualidadApple * 0.14; 
       double ivaAmazon = mensualidadAmazon * 0.16;   
       double totalNetflix = ivaNetflix + mensualidadNetflix;
       double totalDisney = ivaDisney + mensualidadDisney;
       double totalApple = ivaApple + mensualidadApple; 
       double totalAmazon = ivaAmazon + mensualidadAmazon;    
       
       switch (numero){
           
        case 1: 
               resultadofinal = String.format("Usuario:%s\n"
               +"Empresa: Netflix\n"
               + "Precio base: $%.2f\n"
               +"Impuesto: $%.2f\n"
               +"Total a cancelar: $%.2f\n",
               nombre,netflix,ivaNetflix,totalNetflix);
          break;
        case 2: 
               resultadofinal= String.format("Usuario:%s\n"
               +"Empresa: disney\n"
               + "Precio base: $%.2f\n"
               +"Impuesto: $%.2f\n"
               +"Total a cancelar: $%.2f\n",
               nombre,disney,ivaDisney,totalDisney);
          break;     
        case 3: 
               resultadofinal= String.format("Usuario:%s\n"
               +"Empresa: apple\n"
               + "Precio base: $%.2f\n"
               +"Impuesto: $%.2f\n"
               +"Total a cancelar: $%.2f\n",
               nombre,apple,ivaApple,totalApple);
          break;   
        case 4: 
               resultadofinal= String.format("Usuario:%s\n"
               +"Empresa: amazon\n"
               + "Precio base: $%.2f\n"
               +"Impuesto: $%.2f\n"
               +"Total a cancelar: $%.2f\n",
               nombre,amazon,ivaAmazon,totalAmazon);
          break;              
           }
        }else{
    resultadofinal = String.format("%sDatos erroneos\n",resultadofinal);         
       }
    System.out.printf("%s\n", resultadofinal);
    }
    
}
