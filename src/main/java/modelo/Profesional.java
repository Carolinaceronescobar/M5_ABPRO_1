package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Profesional extends Usuario implements  Asesoria{
    private String titulo;
    private Date fechaIngreso;

    Profesional(){}
    Profesional(String nombre, String fechaNacimiento, int run, String titulo, String fechaIngreso) throws ParseException {
        super(nombre, fechaNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = new SimpleDateFormat("dd/MM/yyyy").parse(fechaIngreso);
    }

    // ------ GETTER ------
    public String getTitulo() {return titulo;}
    public Date getFechaIngreso() {return fechaIngreso;}

    // ------ SETTER ------
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setFechaIngreso(String fechaIngreso) throws ParseException {
        this.fechaIngreso = new SimpleDateFormat("dd/MM/yyyy").parse(fechaIngreso);
    }

    // ------ METHODS ------
    @Override
    public String toString() {
        return super.toString() +
                " Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }

    public void analizarUsuario(){
        super.analizarUsuario();
        System.out.println(" " + this.titulo + " " + this.fechaIngreso);
    }
}
