/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Comision;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author GATEWAY1-
 */
public interface int_Comision {

    public ArrayList<Comision> getcomisiones(Connection c, String fecha, String referencia);
    
    public ArrayList<Comision> getcomisiones_Especial(Connection c, String fecha, String referencia);

    public boolean newcomision(Connection c, ArrayList<Comision> arr);
    
    public boolean cancelacomision(Connection c, ArrayList<Comision> arr);
}
