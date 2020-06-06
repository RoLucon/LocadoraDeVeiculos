/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.service;

import rogeriolucon.locadora.interfaces.FinancialServiceInterface;

/**
 *
 * @author rolucon
 */
public class FinancialService implements FinancialServiceInterface{
    private double valueRentPerDay;
    private double depreciationPerKm;
    private double rentBalance;
    private double salesBalance;
    private double purchaseBalance;

    @Override
    public void changeConfig(double rentValuePerDay, double depreciationPerDay) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double rentValuePerDay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double depreciationPerDay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
