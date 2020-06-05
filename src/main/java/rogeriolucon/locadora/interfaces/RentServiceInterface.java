/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.interfaces;

import java.util.ArrayList;
import rogeriolucon.locadora.model.RentOperation;

/**
 *
 * @author rolucon
 */
public interface RentServiceInterface {
    public boolean rentVehicle(RentOperation rent);
    public boolean devolutionVehicle(RentOperation rent);
    public ArrayList<RentOperation> getRenteds();
    public ArrayList<RentOperation> getReturneds();
    public ArrayList<RentOperation> getAllRentOperations();
}
