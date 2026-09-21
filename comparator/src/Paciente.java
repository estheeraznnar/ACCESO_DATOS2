import java.time.LocalDateTime;

public class Paciente {
    private String nombre;
    private int gravedad; // 1 = leve, 10 = crítico
    private LocalDateTime llegada;

    public Paciente(String nombre, int gravedad, LocalDateTime llegada) {
        this.nombre = nombre;
        this.gravedad = gravedad;
        this.llegada = llegada;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGravedad() {
        return gravedad;
    }

    public LocalDateTime getLlegada() {
        return llegada;
    }

    @Override
    public String toString() {
        return nombre + " (gravedad " + gravedad + ", llegada " + llegada + ")";
    }
}
