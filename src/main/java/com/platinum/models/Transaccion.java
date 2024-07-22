package com.platinum.models;

import java.math.BigDecimal;

public class Transaccion {
    private int id;
    private String rutCliente;
    private String rutDueno;
    private int idCuenta;
    private BigDecimal montoTransferencia;
    private String cuentaTransferencia;
    private String tipoCuenta;

    // Getters y Setters

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRutCliente() {
        return this.rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getRutDueno() {
        return this.rutDueno;
    }

    public void setRutDueno(String rutDueno) {
        this.rutDueno = rutDueno;
    }

    public int getIdCuenta() {
        return this.idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public BigDecimal getMontoTransferencia() {
        return this.montoTransferencia;
    }

    public void setMontoTransferencia(BigDecimal montoTransferencia) {
        this.montoTransferencia = montoTransferencia;
    }

    public String getCuentaTransferencia() {
        return this.cuentaTransferencia;
    }

    public void setCuentaTransferencia(String cuentaTransferencia) {
        this.cuentaTransferencia = cuentaTransferencia;
    }

    public String getTipoCuenta() {
        return this.tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

}