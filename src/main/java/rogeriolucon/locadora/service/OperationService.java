/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.service;

import java.util.List;
import rogeriolucon.locadora.model.Operation;

/**
 *
 * @author rolucon
 */
public class OperationService {
    
    
    public boolean sellVehicle(){
        return true;
    }
    
    public boolean rentVehicle(){
        return true;
    }
    public boolean devolutionVehicle(){
        return true;
    }
    public boolean purchaseVehicle(){
        return true;
    }
    
    public Operation getRent(){
        return null;
    }
    
    public List<Operation> getWaxedRents(){
        return null;
    }
    
    public List<Operation> getOpenRents(){
        return null;
    }
    
    public List<Operation> getAllSales(){
        return null;
    }
    
    public List<Operation> getAllPurchases(){
        return null;
    }
}
