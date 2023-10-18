package EjerciciosJava;

public class Operadores {
    
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;
        int resultado;

        //*******OPERADORES MATEMATICOS*******//

         // Suma
         resultado = num1 + num2;
        System.out.println("\n\nLa suma de los numeros "+ num1 + " y " + num2 +" es: "+ resultado + "\n");

        // Resta
        resultado = num2 - num1;

        String desSum = "\n\nLa resta de los numeros ";

        System.out.println(desSum.concat( String.valueOf(num2)) + " menos " + num1 +" es: " + resultado + "\n" );

        // Multiplicación
        resultado =  num2 * num1;
        System.out.println("\n\nLa multiplicación de los números, "
        .concat( String.valueOf(num2) ).concat(" por ").concat(String.valueOf(num1)).concat(" es: ")
        .concat( String.valueOf(resultado) ).concat("\n"));

        // Division  uso de método concat()  de la clase String
        resultado =  num2 / num1;
        System.out.println("La Division de los números, "
        .concat( String.valueOf(num2) ).concat(" entre ").concat(String.valueOf(num1)).concat(" es: ")
        .concat( String.valueOf(resultado) ).concat("\n"));

         // Mod -> resto 
        resultado = num2 % num1;
        System.out.println("Resto: " + resultado+"\n\n");

          num2 ++;      // Suma 1
          num2 --;      // Resta 1
          
          num1 -= num2; // Reta el valor de num2 a num1
          num1 += num2; // Suma el valor de num2 a num1

         // ***OPERADORES LOGICOS***  //

         //   ==   Igual
         //   !=  no es igual
         //   ||   or 
         //   &&   Y
         //   >   Mayor que
         //   <   Menor que
         //   <=  Menor igual que
         //   >=  Mayor igual que
                        
        if (num1 == num2 || num1 < num2) {
              System.out.println("Es valido");
                  System.out.println("Num1 vale:"+num1+" Num2 vale:"+num2);
        } else{
             System.out.println("No es valido");
                  System.out.println("Num1 vale:"+num1+" Num2 vale:"+num2);
        }

    }


}
