/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.model;

import java.time.LocalDate;
import rogeriolucon.locadora.model.Vehicle.Tank;

/**
 *
 * @author rolucon
 */
public class RentOperation extends Operation {
        public enum Type {RETIRADA, DEVOLUÇÃO;}
        private Type type;
        private Tank finalTank;
        private LocalDate expirationDate;
        private LocalDate waxedDate;
        private boolean contractOpen;
        private double finalValue;
        private double finalKm;
        
        
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public LocalDate getWaxedDate() {
        return waxedDate;
    }

    public void setWaxedDate(LocalDate waxedDate) {
        this.waxedDate = waxedDate;
    }

    public boolean isContractOpen() {
        return contractOpen;
    }

    public void setContractOpen(boolean contractOpen) {
        this.contractOpen = contractOpen;
    }

    public double getFinalValue() {
        return finalValue;
    }

    public void setFinalValue(double finalValue) {
        this.finalValue = finalValue;
    }
    
    public double devolutionDif() {
        return finalValue - getValue();
    }    

    public Tank getFinalTank() {
        return finalTank;
    }

    public void setFinalTank(Tank finalTank) {
        this.finalTank = finalTank;
    }

    public double getFinalKm() {
        return finalKm;
    }

    public void setFinalKm(double finalKm) {
        this.finalKm = finalKm;
    }
    
    
}
