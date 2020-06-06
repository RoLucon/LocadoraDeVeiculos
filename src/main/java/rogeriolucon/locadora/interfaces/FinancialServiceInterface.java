/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.interfaces;

/**
 *
 * @author rolucon
 */
public interface FinancialServiceInterface {
    void changeConfig(double rentValuePerDay, double depreciationPerDay);
    double rentValuePerDay();
    double depreciationPerDay();
    
}
