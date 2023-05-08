package modelo;

public class Capacitacion {
    private int id;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private int duracion;
    private int cantAsistentes;
    public Capacitacion(){}
    public Capacitacion(int id, int rutCliente, String dia, String hora, String lugar, int duracion, int cantAsistentes){
        this.id = id;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora =hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantAsistentes = cantAsistentes;
    }

    // ------ SETTER/GETTER ------
    public int getId() {return id;}
    public int getRutCliente() {return rutCliente;}
    public String getDia() {return dia;}
    public String getHora() {return hora;}
    public String getLugar() {return lugar;}
    public int getDuracion() {return duracion;}
    public int getCantAsistentes() {return cantAsistentes;}

    public void setId(int id) {this.id = id;}
    public void setRutCliente(int rutCliente) {this.rutCliente = rutCliente;}
    public void setDia(String dia) {this.dia = dia;}
    public void setHora(String hora) {this.hora = hora;}
    public void setLugar(String lugar) {this.lugar = lugar;}
    public void setDuracion(int duracion) {this.duracion = duracion;}
    public void setCantAsistentes(int cantAsistentes) {this.cantAsistentes = cantAsistentes;}

    // ------ METODOS ------

    @Override
    public String toString() {
        return "Capacitacion{" +
                "id=" + id +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion=" + duracion +
                ", cantAsistentes=" + cantAsistentes +
                '}';
    }
    public String mostrarDetalle(){
        return "La capacitacion sera en " + this.lugar + " a las " + this.hora +
                " del dia " + this.dia + " , y durara " + this.duracion + " minutos";
    }
}
