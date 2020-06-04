/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.model;

import java.util.Date;

/**
 *
 * @author rolucon
 */
public class RentOperation extends Operation {
        public enum Type {RETIRADA, DEVOLUÇÃO;}
        private Type type;
        private Date expirationDate;
        private Date waxedDate;
        private boolean contractOpen; 

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getWaxedDate() {
        return waxedDate;
    }

    public void setWaxedDate(Date waxedDate) {
        this.waxedDate = waxedDate;
    }

    public boolean isContractOpen() {
        return contractOpen;
    }

    public void setContractOpen(boolean contractOpen) {
        this.contractOpen = contractOpen;
    }
        
        
}
