package modelo;

import java.text.ParseException;

public class Administrativo extends Usuario implements  Asesoria{
    private String area;
    private String experienciaPrevia;

    Administrativo(){}
    Administrativo(String nombre, String fechaNacimiento, int run, String area, String experienciaPrevia) throws ParseException {
        super(nombre, fechaNacimiento, run);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }
    // ------ GETTER ------
    public String getArea() {return area;}
    public String getExperienciaPrevia() {return experienciaPrevia;}

    // ------ SETTER ------
    public void setArea(String area) {this.area = area;}
    public void setExperienciaPrevia(String experienciaPrevia) {this.experienciaPrevia = experienciaPrevia;}

    // ------ METHODS ------
    @Override
    public String toString() {
        return  super.toString() +
                " Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
    }

    public void analizarUsuario(){
        super.analizarUsuario();
        System.out.println(" " + this.area + " " + this.experienciaPrevia);
    }

}
