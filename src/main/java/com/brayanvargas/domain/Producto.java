package com.brayanvargas.domain;

public class Producto {
    private int codigoBV;
    private String nombreBV;
    private int cantidadBV;
    private int precioBV;
    private String tipoBV;

    public Producto(int codigoBV, String nombreBV, int cantidadBV, int precioBV, String tipoBV) {
        this.codigoBV = codigoBV;
        this.nombreBV = nombreBV;
        this.cantidadBV = cantidadBV;
        this.precioBV = precioBV;
        this.tipoBV = tipoBV;
    }

    public int getCodigoBV() {
        return codigoBV;
    }

    public String getNombreBV() {
        return nombreBV;
    }

    public int getCantidadBV() {
        return cantidadBV;
    }

    public int getPrecioBV() {
        return precioBV;
    }

    public String getTipoBV() {
        return tipoBV;
    }

    public void setCantidadBV(int cantidadBV) {
        this.cantidadBV = cantidadBV;
    }
}
