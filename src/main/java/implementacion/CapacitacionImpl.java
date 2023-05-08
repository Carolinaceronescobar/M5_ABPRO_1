package implementacion;
import modelo.Capacitacion;

import interfaces.CapacitacionInterface;
import utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
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

    public List<Capacitacion> listarCapacitaciones_nuevo() {
        List<Capacitacion> capacitaciones = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps =null;
        ResultSet rs =null;
        try {
            conn = DatabaseConnection.getConnection();
            ps= conn.prepareStatement("SELECT * FROM capacitaciones");
            rs= ps.executeQuery();

            while (rs.next()){
                Capacitacion capacitacion = getCapacitacion(rs);

                capacitaciones.add(capacitacion);
            }
        } catch (SQLException e){
System.out.println("hola");
        } finally {
            try {
                if (rs!=null) rs.close();
                if (ps!=null) ps.close();
                if (conn!=null) conn.close();

            } catch (SQLException e) {

            }
        }
        return capacitaciones;
    }
    private static Capacitacion getCapacitacion(ResultSet resultSet) throws SQLException {
        Capacitacion capacitacion = new Capacitacion();
        capacitacion.setId(resultSet.getInt("id"));
        capacitacion.setRutCliente(resultSet.getInt("rut_cliente"));
        capacitacion.setDia(resultSet.getString("dia"));
        capacitacion.setHora(resultSet.getString("hora"));
        capacitacion.setLugar(resultSet.getString("lugar"));
        capacitacion.setDuracion(resultSet.getInt("duracion"));
        capacitacion.setCantAsistentes(resultSet.getInt("cantidad"));
        return capacitacion;
    }
}
