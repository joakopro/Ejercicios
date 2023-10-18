package EjerciciosJava;

public class Utils {


    public static boolean validaDecimal(String valor) {
        try {
              Double.valueOf(valor.trim());
        } catch (Exception e ) {
           return false;
        }
          return true;
    }


    public static boolean validaFloat(String valor) {
            try {
                Float.valueOf(valor.trim());
            } catch (Exception e ) {
            return false;
            }
            return true;
    }

    
}
