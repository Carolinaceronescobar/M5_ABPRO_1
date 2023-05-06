package implementacion;
import modelo.Capacitacion;

import interfaces.CapacitacionInterface;
import java.util.ArrayList;
import java.util.List;
public class CapacitacionImpl implements CapacitacionInterface {
    private List<Capacitacion> capacitaciones = new ArrayList<>();


    public List<Capacitacion> listarCapacitaciones() {
        // Generar lista de capacitaciones manualmente
        Capacitacion cap1 = new Capacitacion(1, 26579154, "28/06/1996", "08:00", "UNAB", 85, 20);
        Capacitacion cap2 = new Capacitacion(2, 5596969, "01/06/1996", "09:00", "MALL", 60, 40);
        Capacitacion cap3 = new Capacitacion(3,12345678, "15/06/1996", "10:00", "OULET", 70, 50);

        capacitaciones.add(cap1);
        capacitaciones.add(cap2);
        capacitaciones.add(cap3);

        return capacitaciones;
    }

    public void almacenarCapacitacion(Capacitacion c){
        capacitaciones.add(c);
        System.out.println("Nueva capacitación creada:");
        c.toString();
    }


   /* public void listarCapacitaciones(){
        for(Capacitacion c: capacitaciones){
            System.out.println(c.mostrarDetalle());
            System.out.println("Cliente asociado:");
            for(Usuario u: asesorias){
                if(u instanceof Cliente && ((Cliente) u).getRut() == c.getRutCliente()){
                    ((Cliente) u).analizarUsuario();
                }
            }
        }
    }*/
}
