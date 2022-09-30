package tp04.laboratorio;

public class Materia {

    private int idMateria;

    private String Nombre;

    private int anio;

    public Materia(int idMateria, String Nombre, int anio) {
        this.idMateria = idMateria;
        this.Nombre = Nombre;
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return  Nombre +" "+ anio ;
    }

}
