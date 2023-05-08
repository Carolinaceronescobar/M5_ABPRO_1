package interfaces;
import modelo.Capacitacion;
import java.util.ArrayList;
import java.util.List;
public interface CapacitacionInterface {
    public void almacenarCapacitacion(modelo.Capacitacion c);
    public List<Capacitacion> listarCapacitaciones();

    public List<Capacitacion> listarCapacitaciones_nuevo();
}
