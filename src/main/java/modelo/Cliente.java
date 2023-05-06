package modelo;

import java.text.ParseException;
import java.util.ArrayList;

public class Cliente extends Usuario implements  Asesoria{
    private int rut;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String afp;
    private byte sistemaSalud;
    private String direccion;
    private String comuna;
    private byte edad;

    private ArrayList<Capacitacion>  capacitaciones = new ArrayList<Capacitacion>();
    private ArrayList<Accidente> accidentes = new ArrayList<Accidente>();
    private  ArrayList<VisitaTerreno> visitasTerreno = new ArrayList<VisitaTerreno>();

    Cliente(){}
    Cliente(String fechaNacimiento, int rut, String nombre, String apellidos, String telefono, String afp,
            byte sistemaSalud, String direccion, String comuna, byte edad) throws ParseException {
        super(nombre, fechaNacimiento, rut);
        this.rut = rut;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }
    // ------ GETTER ------
    public int getRut() {return this.rut;}
    public String getNombre() {return this.nombre;}
    public String getApellidos() {return this.apellidos;}
    public String getTelefono() {return this.telefono;}
    public String getAfp() {return this.afp;}
    public byte getSistemaSalud() {return this.sistemaSalud;}
    public String getDireccion() {return this.direccion;}
    public String getComuna() {return this.comuna;}
    public byte getEdad() {return this.edad;}
    public  ArrayList<Capacitacion> getCapacitaciones(){return this.capacitaciones;}
    public  ArrayList<Accidente> getAccidentes(){return this.accidentes;}
    public  ArrayList<VisitaTerreno> getVisitasTerreno(){return this.visitasTerreno;}

    // ------ SETTER -----
    public void setRut(int rut) {this.rut = rut;}
    public void setNombre(String nombre) {
        super.setNombre(nombre);
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public void setAfp(String afp) {this.afp = afp;}
    public void setSistemaSalud(byte sistemaSalud) {this.sistemaSalud = sistemaSalud;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    public void setComuna(String comuna) {this.comuna = comuna;}
    public void setEdad(byte edad) {this.edad = edad;}


    // ------ METHODS ------
    public String toString() {
        return super.toString() +
                " Cliente{" +
                "rut=" + rut +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", afp='" + afp + '\'' +
                ", sistemaSalud=" + sistemaSalud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String obtenerNombre(){
        return this.nombre + " " + this.apellidos;
    }

    public String obtenerSistemaSalud(){
        if(this.sistemaSalud == 1){return "Fonasa";}
        if(this.sistemaSalud == 2){return "Isapre";}
        return "No se indica sistema de salud";
    }

    public void analizarUsuario(){
        super.analizarUsuario();
        System.out.println(" " + this.apellidos + " rutCliente: " + this.rut + " " + this.telefono + " " + this.afp + " " +
                this.sistemaSalud + " " + this.direccion + " " + this.comuna + " " + this.edad);
    }

    public void agregarCapacitacion(Capacitacion c){
        capacitaciones.add(c);
    }

    public void agregarAccidente(Accidente a){
        accidentes.add(a);
    }

    public void agregarVisitaTerreno(VisitaTerreno v){
        visitasTerreno.add(v);
    }
}
