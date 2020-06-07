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

    public FinancialService() {
        valueRentPerDay = 45.0;
        depreciationPerKm = 0.1;
        rentBalance = 0;
        salesBalance = 0;
        purchaseBalance = 0;
        
    }

    public double getRentBalance() {
        return rentBalance;
    }

    public void addRentBalance(double rentBalance) {
        this.rentBalance += rentBalance;
    }

    public double getSalesBalance() {
        return salesBalance;
    }

    public void addSalesBalance(double salesBalance) {
        this.salesBalance += salesBalance;
    }

    public double getPurchaseBalance() {
        return purchaseBalance;
    }

    public void addPurchaseBalance(double purchaseBalance) {
        this.purchaseBalance += purchaseBalance;
    }
    
    public double getBalance(){
        return  (rentBalance + salesBalance - purchaseBalance);
    }
    
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
