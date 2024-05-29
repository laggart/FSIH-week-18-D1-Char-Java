import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        List<Partido> partidos = new ArrayList<>();

        partidos.add(new Partido("PSOE"));
        partidos.add(new Partido("PP"));
        partidos.add(new Partido("SUMAR"));
        partidos.add(new Partido("VOX"));
        partidos.add(new Partido("Junts"));

        boolean continuar = true;

        while (continuar) {
            //Pedir porcentajes de votos para cada partido
            for (Partido partido : partidos) {
                System.out.println("introduce el porcentaje de votos para " + partido.getNombre() + ": ");
                while (!teclado.hasNextDouble()) {
                    System.out.println("por favor, introduce un número váido.");
                    teclado.next();
                    
                }

                double porcentaje = teclado.nextDouble();
                partido.setPorcentaje(porcentaje);     
            }


            if (!Metodos.validarPorcentajes(partidos)) {
                System.out.println("La suma de los porcentajes es mayor al 100%, por favor introduce los valores de nuevo.");
                continue;
            }

            Metodos.mostrarResultados(partidos);

            System.out.print("Actualizar resultados? S/N ");
            char respuesta = teclado.next().trim().toUpperCase().charAt(0);
            if (respuesta == 'N') {
                continuar = false;
            }
            if (continuar) { 
                Metodos.limpiarPantalla();
            }
        }


       Metodos.limpiarPantalla();
       System.out.println("Hasta la próxima!");
       teclado.close();
    }
}
