package com.platinum.models;

import java.math.BigDecimal;

public class CtaCorriente {
    private int idCuenta;
    private String rutCliente;
    private BigDecimal monto;
    private String rutEjecutivo;

    // Getters y Setters

    public int getIdCuenta() {
        return this.idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getRutCliente() {
        return this.rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public BigDecimal getMonto() {
        return this.monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getRutEjecutivo() {
        return this.rutEjecutivo;
    }

    public void setRutEjecutivo(String rutEjecutivo) {
        this.rutEjecutivo = rutEjecutivo;
    }

}