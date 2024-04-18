/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Comision;
import Persistencia.sql_comisiones;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author GATEWAY1-
 */
public class dao_comisiones implements int_Comision {

    private final sql_comisiones s = new sql_comisiones();

    /**
     * Obtiene las comisiones si es que existen del pago reciente haciendo como
     * filtro la fecha de creacion del cargo, la fecha de pago y si no tiene
     * saldo
     *
     * @param c
     * @param fecha
     * @param referencia
     * @param turno
     * @return
     */
    @Override
    public ArrayList<Comision> getcomisiones(Connection c, String fecha,
            String referencia, String turno) {
        return s.getcomisiones(c, fecha, referencia, turno);
    }

    /**
     * Crea e inserta en la bd n numero de comisiones de acuerdo al numero de
     * facturas selecionadas y que cumplan con el filtro anterior
     *
     * @param c
     * @param arr
     * @return
     */
    @Override
    public boolean newcomision(Connection c, ArrayList<Comision> arr) {
        return s.newcomision(c, arr);
    }

    /**
     * Cancela las comisiones generadas de acuerdo a la cancelacion, es array ya
     * que puede ser cancelacion de una factura o de varias si es un pago
     *
     * @param c Puede ser cpt o cobranza, depende el tipo de cancelacion
     * @param arr lista de comisiones
     * @return
     */
    @Override
    public boolean cancelacomision(Connection c, ArrayList<Comision> arr) {
        return s.cancelacomision(c, arr);
    }

    /**
     * Obtiene las comisiones si es que existen del pago reciente haciendo como
     * filtro la fecha de creacion del cargo especial, la fecha de pago y si no
     * tiene saldo
     *
     * @param c
     * @param fecha
     * @param referencia
     * @param turno
     * @return
     */
    @Override
    public ArrayList<Comision> getcomisiones_Especial(Connection c, String fecha,
            String referencia, String turno) {
        return s.getcomisiones_Especial(c, fecha, referencia, turno);
    }

    /**
     * Obtiene las comisiones pendientes de pagar a los agentes, osease que
     * status sea 1
     *
     * @param c conexion cpt
     * @param nombre nombre del agente
     * @param bd nombre de bd de cobranza
     * @return lista de comisiones
     */
    @Override
    public ArrayList<Comision> getcomisiones_toadm(Connection c, String nombre, String bd) {
        return s.getcomisiones_toadm(c, nombre, bd);
    }

    /**
     * Cambia el estatus de la comision a "2", esto indica que la comision ha
     * sido entregada al agente
     *
     * @param c
     * @param arr
     * @return
     */
    @Override
    public boolean Comisionpagada(Connection c, ArrayList<Comision> arr) {
        return s.Comisionpagada(c, arr);
    }

    /**
     * Cancela la comision realizada, es similar a la primer funcion, solo que
     * en esta tambien utiliza la referencia de la factura y no solo el cargo y
     * la serie
     *
     * @param c
     * @param arr
     * @return
     */
    @Override
    public boolean cancelacomision_pagos(Connection c, ArrayList<Comision> arr) {
        return s.cancelacomision_pago(c, arr);
    }

}
