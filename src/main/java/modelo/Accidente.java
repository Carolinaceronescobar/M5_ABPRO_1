package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Accidente {
    private int id;
    private int rutCliente;
    private Date fecha;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencia;

    Accidente(){}
    Accidente(int id, int rutCliente, String fecha, String hora, String lugar, String origen, String consecuencia) throws ParseException {
        this.id = id;
        this.rutCliente = rutCliente;
        this.fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencia = consecuencia;
    }
    // ------ SETTER ------
    public void setId(int id) {this.id = id;}
    public void setRutCliente(int rutCliente) {this.rutCliente = rutCliente;}
    public void setFecha(String fecha) throws ParseException {new SimpleDateFormat("dd/MM/yyyy").parse(fecha);}
    public void setHora(String hora) {this.hora = hora;}
    public void setLugar(String lugar) {this.lugar = lugar;}
    public void setOrigen(String origen) {this.origen = origen;}
    public void setConsecuencia(String consecuencia) {this.consecuencia = consecuencia;}

    // ------ GETTER ------
    public int getId() {return id;}
    public int getRutCliente() {return rutCliente;}
    public Date getFecha() {return fecha;}
    public String getHora() {return hora;}
    public String getLugar() {return lugar;}
    public String getOrigen() {return origen;}
    public String getConsecuencia() {return consecuencia;}

    // ------ METHODS ------
    public String toString() {
        return "Accidente{" +
                "id=" + id +
                ", rutCliente=" + rutCliente +
                ", fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencia='" + consecuencia + '\'' +
                '}';
    }
}
