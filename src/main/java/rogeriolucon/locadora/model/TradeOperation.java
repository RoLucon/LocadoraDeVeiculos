/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.model;

/**
 *
 * @author rolucon
 */
public class TradeOperation extends Operation {
        public enum Type {COMPRA, VENDA;}
        private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
        
}
