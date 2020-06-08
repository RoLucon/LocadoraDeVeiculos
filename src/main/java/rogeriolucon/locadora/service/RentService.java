/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import rogeriolucon.locadora.DAO.DaoException;
import rogeriolucon.locadora.DAO.RentOperationDAO;
import rogeriolucon.locadora.DAO.VehicleDAO;
import rogeriolucon.locadora.interfaces.RentServiceInterface;
import rogeriolucon.locadora.model.RentOperation;
import rogeriolucon.locadora.model.Vehicle;


/**
 *
 * @author rolucon
 */
public class RentService implements RentServiceInterface {
    private static int id = 0;
    public Map<Integer, RentOperation> rentedVehicles = new HashMap();
    public Map<Integer, RentOperation> returnedVehicles = new HashMap();

    public RentService() {
        try {
            RentOperationDAO rentDao = new RentOperationDAO();
            Map<Integer, RentOperation> aux = rentDao.selectAll();
            rentedVehicles = aux.entrySet().stream()
                    .filter(map -> map.getValue().isContractOpen()== true)
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
            returnedVehicles = aux.entrySet().stream()
                    .filter(map -> map.getValue().isContractOpen()== false)
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
            
        } catch (DaoException ex) {
            Logger.getLogger(RentService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public boolean rentVehicle(RentOperation rent){
        rent.setType(RentOperation.Type.RETIRADA);
        rent.setContractOpen(true);
        rent.setFinalKm(-1);
        rent.setFinalValue(-1);
        rent.setFinalTank(Vehicle.Tank.LOW);
        VehicleDAO vehicleDao = new VehicleDAO();
        RentOperationDAO rentDao = new RentOperationDAO();
        try {
            int id = rentDao.insert(rent);
            rent.setId(id);
            vehicleDao.update(rent.getVehicle());
            rentedVehicles.put(rent.getId(), rent);
        } catch (DaoException ex) {
            Logger.getLogger(RentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Passar para o banco
        return true;
    }
    
    @Override
    public boolean devolutionVehicle(RentOperation rent){
        rent.setType(RentOperation.Type.DEVOLUÇÃO);
        rentedVehicles.remove(rent.getId());
        returnedVehicles.put(rent.getId(), rent);
        rent.setContractOpen(false);
        VehicleDAO vehicleDao = new VehicleDAO();
        RentOperationDAO rentDao = new RentOperationDAO();
        try {
//            rentDao.insert(rent);
            vehicleDao.update(rent.getVehicle());
        } catch (DaoException ex) {
            Logger.getLogger(RentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Passar para o banco
        return true;
    }
    
    @Override
    public ArrayList<RentOperation> getRenteds(){
        return new ArrayList(rentedVehicles.values());
    }
    
    @Override
    public ArrayList<RentOperation> getReturneds(){
        return new ArrayList(returnedVehicles.values());
    }
    
    @Override
    public ArrayList<RentOperation> getAllRentOperations(){
        ArrayList<RentOperation> aux = new ArrayList(rentedVehicles.values());
        aux.addAll(new ArrayList(returnedVehicles.values()));
        return aux;
    }
}
