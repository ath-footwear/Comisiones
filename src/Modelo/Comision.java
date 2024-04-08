/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author GATEWAY1-
 */
public class Comision implements java.io.Serializable{

    private int id_cargo, dias, id_agente, porcentaje, id_comision;
    private String moneda, fecha, usuario, estatus, serie, referencia, foliopago;
    private double importe, comision, tipocambio;
    private String nagente;

    public String getNagente() {
        return nagente;
    }

    public void setNagente(String nagente) {
        this.nagente = nagente;
    }

    public int getId_comision() {
        return id_comision;
    }

    public void setId_comision(int id_comision) {
        this.id_comision = id_comision;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getFoliopago() {
        return foliopago;
    }

    public void setFoliopago(String foliopago) {
        this.foliopago = foliopago;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getId_agente() {
        return id_agente;
    }

    public void setId_agente(int id_agente) {
        this.id_agente = id_agente;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getTipocambio() {
        return tipocambio;
    }

    public void setTipocambio(double tipocambio) {
        this.tipocambio = tipocambio;
    }

}
