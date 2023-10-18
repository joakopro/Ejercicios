package EjerciciosJava;

import java.util.Scanner;

public class EjAreaCirculo {

public static void main(String[] args) {

    Scanner entrada;
    System.out.println(" *****CALCULA EL AREA DE UN CIRCULO****");

    for(int i=0; i<10;i++  ){
            
        entrada = new Scanner(System.in);
        System.out.println(" Introduzca el radio:\n");
        
        String eRadio = entrada.next(); // introduzco el valor
        
        boolean esValido = validaDecimal(eRadio);
        
        if(esValido){ // valido el parametro, que sea decimal...

          double area =  getArea(eRadio);

           System.out.println("El area del circulo es: "+ area );  // mostrar resultado
             entrada.close();
             break;
        } else {
           System.out.println("Paremetro erroneo, vuelva a intentarlo.");
           continue;
        }
    }
}


private static double getArea(double eRadio) {
    return getArea(String.valueOf(eRadio));
}

private static double getArea(String eRadio) {
    double radio = new Double(eRadio); // dar formato decimal...
    double cd = Math.pow(radio, 2);  // sacarmos el cuadrado
    double area =   3.1416 * cd;  // realizamos la operacion, multiplicar PI por areas al cuadrado...
     return area;
}    

public static boolean validaDecimal(String valor) {
    try {
          Double.valueOf(valor.trim());
    } catch (Exception e ) {
       return false;
    }
      return true;
}

    
}
