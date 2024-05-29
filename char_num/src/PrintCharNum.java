import java.util.Scanner;

public class PrintCharNum {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un número entre 33 y 126: ");
        numero = teclado.nextInt();

        if (numero >= 33 && numero <= 126) {
            char caracater = (char) numero;
            System.out.println("El character correspondiente al número " + numero + " es: " + caracater);
        } else {
            System.out.println("el número introducido está fuera del rango solicitado, debe ser entre 33 y 126.");
        }

        teclado.close();
    }
}
