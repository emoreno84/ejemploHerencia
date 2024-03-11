package Clases;

import java.time.LocalDate;

public class Director extends Empleado {
    private String seccion;

    private int bonus;
    public Director(String nombre, LocalDate fecha, int sueldo, String puesto, String seccion, int bonus) {
        super(nombre, fecha, sueldo, puesto);
        this.seccion = seccion;
        if (bonus > 0 && bonus <= 100){
            this.bonus = bonus;
        }else {
            System.out.println("Valor erróneo de bonus. Se especifica un bonus de 0...");
            this.bonus = 0;
        }
    }
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
