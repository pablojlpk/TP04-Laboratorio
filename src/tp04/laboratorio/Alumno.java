package tp04.laboratorio;

import java.util.HashSet;

public class Alumno {

    private int legajo;

    private String apellido;

    private String nombre;

    private HashSet <Materia> mat = new HashSet();

    public Alumno(int legajo, String apellido, String nombre) {
    }

    public int getLegajo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int setLegajo(int legajo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getApellido() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String setApellido(String apellido) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void agregarMateria(Materia m) {
    }

    public int CantidadMaterias() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "Alumno{" + "mat=" + mat + '}';
    }

}
