package EjerciciosJava;

import java.util.Scanner;

public class Temperatura {

   //  F = (C * 9/5) + 32
   //  C = (F - 32) * 5/9

   public static void main(String[] args) {

    String tipoF = "F";
    String tipoC = "C";
 
    Scanner entrada = new Scanner(System.in);

    System.out.println("****CALCULADORA DE TEMPERATURAS****\n");      

       String valor = entrada.next();

       if (Utils.validaFloat(valor)) {

           float temoEnt = Float.valueOf(valor);
        
           float tempRt = convierteCentigrado(temoEnt); 

          System.out.println("La temperatura tipo "+ tipoF + ", en grado centigrados es: "+ tempRt);

       }else{

          System.out.println("No se ha realizado la conversion de grados");
       }


       entrada.close();
    
   }


   public static float convierteTemp(float temp, String tipo ){

      float resultado = 0;

        if("F".equals(tipo)){
          resultado = convierteCentigrado(temp);
        } 
        
        if("C".equals(tipo)){
          resultado = convierteFahrenheit(temp);
        }

        return resultado;

   }


    public static float convierteFahrenheit(float centigrados){

        float gradoFa = (centigrados * 9/5) + 32;

        return gradoFa;         
    }

    public static float convierteCentigrado(float fahrenheit){
            
        float gradoCen = (fahrenheit - 32) * 5/9;

        return gradoCen;
    }


    
}
