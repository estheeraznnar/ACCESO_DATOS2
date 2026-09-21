import java.util.Comparator;

public class ComparadorGravedad implements Comparator<Paciente> {

    @Override
    public int compare(Paciente o1, Paciente o2) {
        //1 Mayor gravedad
        if (o1.getGravedad() != o2.getGravedad()){
            return Integer.compare(o2.getGravedad(), o1.getGravedad());
        }
        //2 gravedad igual:
        return o1.getLlegada().compareTo(o2.getLlegada());
    }
}
