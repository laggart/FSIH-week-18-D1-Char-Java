import java.util.List;

public class Metodos {
    public static void mostrarResultados(List<Partido> partidos) {
        for (Partido partido : partidos) {
            System.out.println(partido);
            int barraLongitud = (int) partido.getPorcentaje();
            for (int i = 0; i < barraLongitud; i++) {
                System.out.print("#");    
            }
            System.out.println();
        }
    }

    public static void limpiarPantalla() {
        System.out.println("\033[H\033[2J");
        System.out.flush();

    }

    public static void aprietaEnter() {
        System.out.println("Para seguir, aprieta enter...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace(); // TODO: handle exception
        }
    }

    public static boolean validarPorcentajes(List<Partido> partidos) {
        double sumaPorcentajes = 0;
        for (Partido partido : partidos) {
            sumaPorcentajes += partido.getPorcentaje();
        }
        return sumaPorcentajes <= 100;
    }

}
