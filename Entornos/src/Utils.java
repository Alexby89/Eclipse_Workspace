import java.util.Scanner;

public class Utils {

    public static Scanner teclado = new Scanner(System.in);

    public static boolean esTriangulo(int a, int b, int c) {
        boolean resultado = false;
    	if (a <= 0 || b <= 0 || c <= 0) {
            resultado = false;
        }
        if(a + b > c && a + c > b && b + c > a) {
        	resultado = true;
        }
        return resultado;
    }

    public static String tipoTriangulo() {

        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + "º numero: ");
            numeros[i] = teclado.nextInt();

            if (numeros[i] <= 0) {
                return "ERROR";
            }
        }

        if (!esTriangulo(numeros[0], numeros[1], numeros[2])) {
            return "ERROR";
        }

        if (numeros[0] == numeros[1] && numeros[1] == numeros[2]) {
            return "EQUILATERO";
        } else if (numeros[0] != numeros[1] && numeros[1] != numeros[2]
                && numeros[0] != numeros[2]) {
            return "ESCALENO";
        } else {
            return "ISOSCELES";
        }
    }

    public static int masFrecuenteInt(int[] array) {
        int masRepetido = array[0];
        int maxRepeticiones = 1;

        for (int i = 0; i < array.length; i++) {
            int contador = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    contador++;
                }
            }

            if (contador > maxRepeticiones) {
                maxRepeticiones = contador;
                masRepetido = array[i];
            }
        }

        return masRepetido;
    }

    public static int buscarInt(int[] numeros, int valor) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}