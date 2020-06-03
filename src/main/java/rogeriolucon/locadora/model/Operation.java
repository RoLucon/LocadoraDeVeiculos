/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.model;

import java.util.Date;
import rogeriolucon.locadora.model.Vehicle.Tank;

/**
 *
 * @author rolucon
 */
public class Operation {
    public enum Type {COMPRA, VENDA, RETIRADA, DEVOLUÇÃO;}
    private Vehicle vehicle;
    private Date date;
    private double value;
    private double km;
    private Tank tank;
}
