/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClsTrabajo1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClsTrabajo1 {
    private static Scanner teclado = new Scanner(System.in);
    
    public void letras(){
       String palabra;
       String Ascii="";
       
       System.out.println("Ingresa una palabra:");
       palabra = teclado.nextLine();
       
       for (int i = 0; i < palabra.length(); i++) {
           Ascii = Ascii + ","+(int) palabra.charAt(i);
           System.out.println(palabra.charAt(i));
       }
       
       System.out.println("La concatenacion es="+Ascii);
       
       
       //////////
       int llave =5;
       int codificar =0;
        String Resultado = "";
        
        for (int x = 0; x < palabra.length(); x++){
            codificar = (int) palabra.charAt(x);
            codificar = codificar - llave;
            char caracter = (char) codificar;
            Resultado = Resultado + caracter;
        }
         System.out.println("La Encriptacion es= "+Resultado);
         
         /////
         String Resultado1 = "";
         for (int i = 0; i < Resultado.length(); i++) {
           Resultado1 = Resultado1 + ","+(int) Resultado.charAt(i);
           System.out.println(Resultado.charAt(i));
       }
       
       System.out.println("La nueva concatenacion es="+Resultado1);
   }
        
    
}
