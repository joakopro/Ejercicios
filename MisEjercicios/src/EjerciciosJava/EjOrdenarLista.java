package EjerciciosJava;
import java.util.Arrays;

public class EjOrdenarLista {
    public static void main(String[] args) throws Exception {

        // Forma facil
        int [] listaNum  = {7,2,4,8,3,9,1,5,10,6};
        System.out.println("Lista antes de ordenar:");
        String listToString = Arrays.toString(listaNum);
        System.out.println(listToString);
       
        // ordena la lista
        Arrays.sort(listaNum);
        System.out.println("Lista despues de ordenar ascendiente:");
        String listToString2 = Arrays.toString(listaNum);
        System.out.println(listToString2);

        // Forma 'dificil'
         System.out.println("Lista despues de ordenar ascendiente,  otro método:");       
         obtenerOrdenAsc(listaNum);
         String listToString3 = Arrays.toString(listaNum);
        System.out.println(listToString3);
         

        System.out.println("Lista despues de ordenar en Descendiente:");       
         obtenerOrdenDesc(listaNum);
        String listToString4 = Arrays.toString(listaNum);
        System.out.println(listToString4);

    }


    private static void obtenerOrdenAsc(int[] listaNum) {
        int temporal = 0;
            for (int i = 0; i < listaNum.length; i++) {
            for (int j = 1; j < (listaNum.length - i); j++) {
                if (listaNum[j - 1] > listaNum[j]) {
                    temporal = listaNum[j - 1];
                    listaNum[j - 1] = listaNum[j];
                    listaNum[j] = temporal;
                }
              }
            }
    }

        private static void obtenerOrdenDesc(int[] listaNum) {
        int temporal = 0;
         int suma = 0;
            for (int i = 0; i < listaNum.length; i++) {

              suma = suma +listaNum[i];

            for (int j = 1; j < (listaNum.length - i); j++) {
                if (listaNum[j - 1] < listaNum[j]) {
                    temporal = listaNum[j - 1];
                    listaNum[j - 1] = listaNum[j];
                    listaNum[j] = temporal;
                }
              }
            }

            System.out.println("Media de los numeros: " +(suma / listaNum.length));
    }


}
