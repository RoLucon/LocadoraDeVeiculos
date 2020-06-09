/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.service;

import java.util.ArrayList;
import rogeriolucon.locadora.interfaces.FinancialServiceInterface;
import rogeriolucon.locadora.model.RentOperation;
import rogeriolucon.locadora.model.TradeOperation;

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
    
    
    
    public FinancialService(ArrayList<TradeOperation> sale,
        ArrayList<TradeOperation> purchase, ArrayList<RentOperation> rent) {
        
        valueRentPerDay = 45.0;
        depreciationPerKm = 0.5;
        rentBalance = 0;
        salesBalance = 0;
        purchaseBalance = 0;
        
        for (RentOperation r : rent) {
            if(r.getFinalValue() > 0){
                rentBalance += r.getFinalValue();
            }else{
                rentBalance += r.getValue();
            }
        }
        
        for (TradeOperation s : sale) {
            salesBalance += s.getValue();
            System.out.println("Valor  " + s.getValue());
        }
        
        for (TradeOperation p : purchase) {
            purchaseBalance += p.getValue();
            System.out.println("Valor  " + p.getValue());
        } 
    }

    public void addRentBalance(double rentBalance) {
        this.rentBalance += rentBalance;
    }

    public void addSalesBalance(double salesBalance) {
        this.salesBalance += salesBalance;
    }

    public void addPurchaseBalance(double purchaseBalance) {
        this.purchaseBalance += purchaseBalance;
    }
    
    @Override
    public double rentBalance(){
        return rentBalance;
    }
    
    @Override
    public double salesBalance(){
        return salesBalance;
    }
    
    @Override
    public double purchaseBalance(){
        return purchaseBalance;
    }
    
    @Override
    public double getBalance(){
        return  (rentBalance + salesBalance - purchaseBalance);
    }
    
    @Override
    public void changeConfig(double rentValuePerDay, double depreciationPerDay) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double rentValuePerDay() {
        return valueRentPerDay;
    }

    @Override
    public double depreciationPerKm() {
        return depreciationPerKm;
    }
    
    
}
