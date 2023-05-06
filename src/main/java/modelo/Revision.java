package modelo;

public class Revision {
    private int id;
    private int idVisitaTerreno;
    private String nombreRevision;
    private String detalle;
    private int estado;

    Revision(){}
    Revision(int id, int idVisitaTerreno, String nombreRevision, String detalle, int estado){
        this.id = id;
        this.idVisitaTerreno = idVisitaTerreno;
        this.nombreRevision = nombreRevision;
        this.detalle = detalle;
        this.estado = estado;
    }

    // ------ SETTER ------
    public void setId(int id) {this.id = id;}
    public void setIdVisitaTerreno(int idVisitaTerreno) {this.idVisitaTerreno = idVisitaTerreno;}
    public void setNombreRevision(String nombreRevision) {this.nombreRevision = nombreRevision;}
    public void setDetalle(String detalle) {this.detalle = detalle;}
    public void setEstado(int estado) {this.estado = estado;}

    // ------ GETTER ------
    public int getId() {return id;}
    public int getIdVisitaTerreno() {return idVisitaTerreno;}
    public String getNombreRevision() {return nombreRevision;}
    public String getDetalle() {return detalle;}
    public int getEstado() {return estado;}

    // ------ METHODS ------
    public String toString() {
        return "Revision{" +
                "id=" + id +
                ", idVisitaTerreno=" + idVisitaTerreno +
                ", nombreRevision='" + nombreRevision + '\'' +
                ", detalle='" + detalle + '\'' +
                ", estado=" + estado +
                '}';
    }
}
