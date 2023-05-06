package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Usuario implements  Asesoria{
    private String nombre;
    private Date fechaNacimiento;
    private int run;

    Usuario(){}
    Usuario(String nombre, String fechaNacimiento, int run) throws ParseException {
        this.nombre = nombre;
        this.run = run;
        this.fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimiento);
    }

    // ------ SETTER/GETTER ------
    public String getNombre() {return nombre;}
    public Date getFechaNacimiento() {return fechaNacimiento;}
    public int getRun() {return run;}

    public void setRun(int run) {this.run = run;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setFechaNacimiento(String fechaNacimiento) throws ParseException {
        this.fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimiento);
    }

    // ------ METHODS ------
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", run='" + run + '\'' +
                '}';
    }

    public String mostrarEdad(){
        if(this.fechaNacimiento == null){
            return null;
        }
        Date fechaActual = new Date();
        TimeUnit time = TimeUnit.DAYS;
        long dif = fechaActual.getTime() - this.fechaNacimiento.getTime();
        long edad = time.convert(dif, TimeUnit.MILLISECONDS)/365;
        return "El usuario tiene " + edad + " años";
    }

    public void analizarUsuario(){
        System.out.print("Run: " + this.run  + " " + this.nombre);
    }
}
