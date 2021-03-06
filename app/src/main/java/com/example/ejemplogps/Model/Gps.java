package com.example.ejemplogps.Model;

public class Gps
{
    private Long id;
    private String tipo;
    private String lugar;
    private Float latitud;
    private Float longitud;

    public Gps() {
        this.id = null;
        this.lugar = "";
        this.latitud = null;
        this.longitud = null;
    }

    public Gps(String lugar, Float latitud, Float longitud, String tipo) {
        this.id = null;
        this.lugar = lugar;
        this.latitud = latitud;
        this.longitud = longitud;
        this.tipo = tipo;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getLatitud() {
        return latitud;
    }

    public void setLatitud(Float latitud) {
        this.latitud = latitud;
    }

    public Float getLongitud() {
        return longitud;
    }

    public void setLongitud(Float longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString()
    {
        return "Gps {" +
                "id=" + id +
                ", lugar='" + lugar + '\'' +
                ", latitud=" + latitud +
                ", tipo=" + tipo +
                ", idseccion='" + longitud + '\'' +
                '}';
    }
}
