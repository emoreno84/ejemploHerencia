package Clases;

import java.time.LocalDate;

public class Empleado extends Persona{
    private int sueldo;
    private String puesto;
    public Empleado(String nombre, LocalDate fecha, int sueldo, String puesto) {
        super(nombre, fecha);
        this.sueldo = sueldo;
        this.puesto = puesto;
    }
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void aumentoSueldo(int aumento){
        if (aumento > 0 && aumento <= 100){
            int aumentoCuantitativo = aumento * this.getSueldo() / 100;
            int nuevoSueldo = this.getSueldo() + aumentoCuantitativo;
            this.setSueldo(nuevoSueldo);
        }else {
            System.out.println("Especifique un valor entre 1 y 100");
        }
    }

}
