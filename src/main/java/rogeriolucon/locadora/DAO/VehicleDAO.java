/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import rogeriolucon.locadora.ConnectionFactory;
import rogeriolucon.locadora.interfaces.DAOInterface;
import rogeriolucon.locadora.model.Vehicle;

/**
 *
 * @author rolucon
 */
public class VehicleDAO implements DAOInterface<Vehicle>{
    
    @Override
    public ArrayList<Vehicle> selectAll() throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(Vehicle vehicle) throws DaoException {
        String sql = "INSERT INTO vehicle(v_brand, v_category, v_tank, v_model,"
                + " v_year, v_plate, v_price, v_km, v_availability, v_sold)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?)";
        try(Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            conn.setAutoCommit(true);
            
            stmt.setString(1, vehicle.getBrand().toString());
            stmt.setString(2, vehicle.getCategory().toString());
            stmt.setString(3, vehicle.getTank().toString());
            stmt.setString(4, vehicle.getModel().toString());
            stmt.setString(5, vehicle.getYear());
            stmt.setString(6, vehicle.getPlate());
            stmt.setDouble(7, vehicle.getKm());
            stmt.setBoolean(8, vehicle.isAvailability());
            stmt.setBoolean(9, false);
        
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            int id = (int) rs.getLong(1);
            if(rs.next()){
                id = (int) rs.getLong(1);
            } else{
                id = -2;
            }
            
            
            conn.commit();
            ConnectionFactory.closeConnection(conn, stmt, rs);;
            return id;
        }catch (SQLException ex) {
            Logger.getLogger(VehicleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
//    v_id INT AUTO_INCREMENT,
//    v_brand VARCHAR(25),
//    v_category VARCHAR(10),
//    v_tank VARCHAR(15),
//    v_model VARCHAR(50),
//    v_year VARCHAR(4),
//    v_plate VARCHAR(10),
//    v_price DECIMAL(10,2),
//    v_km DECIMAL(10,2),
//    v_availability BOOL DEFAULT TRUE,
//    v_sold BOOL DEFAULT FALSE
    @Override
    public Vehicle selectById(int id) throws DaoException {
         return null;
    }

    @Override
    public boolean update(Vehicle t) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Vehicle t) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
