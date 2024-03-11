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
     * @return
     */
    @Override
    public ArrayList<Comision> getcomisiones(Connection c, String fecha, String referencia) {
        return s.getcomisiones(c, fecha, referencia);
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

}
