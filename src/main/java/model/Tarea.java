package model;


public class Tarea {


    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCompletado(Boolean completado) {
        this.completado = completado;
    }

    public int getId() {
        return id;
    }

    public Tarea(int id, String descripcion, Boolean completado) {
        this.id = id;
        this.descripcion = descripcion;
        this.completado = completado;
    }

    private int id;

    public String getDescripcion() {
        return descripcion;
    }

    private String descripcion;

    public Boolean getCompletado() {
        return completado;
    }

    private Boolean completado;

    public Tarea() {}




}