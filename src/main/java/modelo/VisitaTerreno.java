package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class VisitaTerreno {
    private int id;
    private int rutCliente;
    private Date fecha;
    private String hora;
    private String lugar;
    private String comentario;

    private ArrayList<Revision> revisiones = new ArrayList<Revision>();

    VisitaTerreno(){}
    VisitaTerreno(int id, int rutCliente, String fecha, String hora, String lugar, String comentario) throws ParseException {
        this.id = id;
        this.rutCliente = rutCliente;
        this.fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
        this.hora = hora;
        this.lugar = lugar;
        this.comentario = comentario;
    }
    // ------ SETTER ------
    public void setId(int id) {this.id = id;}
    public void setRutCliente(int rutCliente) {this.rutCliente = rutCliente;}
    public void setFecha(String fecha) throws ParseException {new SimpleDateFormat("dd/MM/yyyy").parse(fecha);}
    public void setHora(String hora) {this.hora = hora;}
    public void setLugar(String lugar) {this.lugar = lugar;}
    public void setComentario(String comentario) {this.comentario = comentario;}

    // ------ GETTER ------
    public int getId() {return id;}
    public int getRutCliente() {return rutCliente;}
    public Date getFecha() {return fecha;}
    public String getHora() {return hora;}
    public String getLugar() {return lugar;}
    public String getComentario() {return comentario;}
    public ArrayList<Revision> getRevisiones(){return revisiones;}

    // ------ METHODS ------
    public String toString() {
        return "VisitaTerreno{" +
                "id=" + id +
                ", rutCliente=" + rutCliente +
                ", fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentario='" + comentario + '\'' +
                '}';
    }
    public void agregarRevision(Revision revision){
        revisiones.add(revision);
    }
}
