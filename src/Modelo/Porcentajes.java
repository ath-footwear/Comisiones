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
public class Porcentajes {

    private String turno;
    private int P0, P1, P2, PX;

    public Porcentajes(String turno) {
        this.turno = turno;
    }

    public void getporcentaje() {
        turno = "5";
        switch (turno) {
            case "5":
                P0 = 3;
                P1 = 2;
                P2 = 1;
                PX = 0;
                break;
            case "6":
                P0 = 3;
                P1 = 2;
                P2 = 1;
                PX = 0;
                break;
            case "7":
                P0 = 5;
                P1 = 3;
                P2 = 2;
                PX = 0;
                break;
        }
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getP0() {
        return P0;
    }

    public void setP0(int P0) {
        this.P0 = P0;
    }

    public int getP1() {
        return P1;
    }

    public void setP1(int P1) {
        this.P1 = P1;
    }

    public int getP2() {
        return P2;
    }

    public void setP2(int P2) {
        this.P2 = P2;
    }

    public int getPX() {
        return PX;
    }

    public void setPX(int PX) {
        this.PX = PX;
    }

}
