public class Partido {
    private String nombre;
    private double porcentaje;

    public Partido(String nombre) {
        this.nombre = nombre;
        this.porcentaje = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPorcentaje() {
        return porcentaje;
    }
    
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje; 
    }

    @Override
    public String toString() {
        return nombre + " : " + porcentaje + "%" ;
    }
}
