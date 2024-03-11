package Clases;

import java.time.LocalDate;

public class Socio extends Persona {
    private int numAcciones;

    public Socio(String nombre, LocalDate fecha, int numAcciones) {
        super(nombre, fecha);
        if (numAcciones > 0){
            this.numAcciones = numAcciones;
        } else {
            this.numAcciones = 0;
        }
    }
    public int getNumAcciones() {
        return numAcciones;
    }

    public void setNumAcciones(int numAcciones) {
        this.numAcciones = numAcciones;
    }
}
