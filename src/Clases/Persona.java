package Clases;

import java.time.LocalDate;

public class Persona {
    private String nombre;

    private LocalDate fechaAlta;
    public Persona(String nombre, LocalDate fecha){
        this.nombre = nombre;
        this.fechaAlta = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}
