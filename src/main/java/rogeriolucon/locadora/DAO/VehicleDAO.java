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
import java.util.HashMap;
import java.util.Map;
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
    public Map<Integer, Vehicle> selectAll() throws DaoException {
        Map<Integer, Vehicle> map = new HashMap();
        String sql = "SELECT * FROM vehicle WHERE v_sold = FALSE";
        try(Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {
            
            while(rs.next()){
                Vehicle vehicle = new Vehicle();
                vehicle.setId(rs.getInt("v_id"));
                vehicle.setTank((Vehicle.Tank.valueOf(rs.getString("v_tank"))));
                vehicle.setBrand((Vehicle.Brand.valueOf(rs.getString("v_brand"))));
                vehicle.setCategory((Vehicle.Category.valueOf(rs.getString("v_category"))));
                vehicle.setModel(rs.getString("v_model"));
                vehicle.setYear(rs.getString("v_year"));
                vehicle.setPlate(rs.getString("v_plate"));
                vehicle.setPrice(rs.getDouble("v_price"));
                vehicle.setKm(rs.getDouble("v_km"));
                vehicle.setAvailability(rs.getBoolean("v_availability"));
                
                map.put(vehicle.getId(), vehicle);
                
            }
            ConnectionFactory.closeConnection(conn, stmt, rs);
        } catch (SQLException ex) {
            Logger.getLogger(VehicleDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        return map;
    }

    @Override
    public int insert(Vehicle vehicle) throws DaoException {
        String sql = "INSERT INTO vehicle(v_brand, v_category, v_tank, v_model,"
                + " v_year, v_plate, v_price, v_km, v_availability, v_sold)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?)";
        try(Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            conn.setAutoCommit(false);
            
            stmt.setString(1, vehicle.getBrand().toString());
            stmt.setString(2, vehicle.getCategory().toString());
            stmt.setString(3, vehicle.getTank().toString());
            stmt.setString(4, vehicle.getModel().toString());
            stmt.setString(5, vehicle.getYear());
            stmt.setString(6, vehicle.getPlate());
            stmt.setDouble(7, vehicle.getPrice());
            stmt.setDouble(8, vehicle.getKm());
            stmt.setBoolean(9, vehicle.isAvailability());
            stmt.setBoolean(10, false);
        
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            int id = -1;
            if(rs.next()){
                id = (int) rs.getLong(1);
            } else{
                id = -2;
            }
            
            
            conn.commit();
            conn.close();
            return id;
        }catch (SQLException ex) {
            Logger.getLogger(VehicleDAO.class.getName()).log(Level.SEVERE, null, ex); 
        }
        return -1;
    }

    @Override
    public Vehicle selectById(int id) throws DaoException {
         return null;
    }

    @Override
    public boolean update(Vehicle vehicle) throws DaoException {
        String sql = "UPDATE vehicle SET v_tank = ?, v_km = ?, v_availability = ? WHERE v_id = ?";
        try(Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)){
            conn.setAutoCommit(true);
            System.out.println("ID VEHICLE:" + vehicle.getId());
            System.out.println(vehicle.getKm());
            System.out.println(vehicle.isAvailability());
            stmt.setString(1, vehicle.getTank().toString());
            stmt.setDouble(2, vehicle.getKm());
            stmt.setBoolean(3, vehicle.isAvailability());
            stmt.setInt(4, vehicle.getId());
        
            stmt.executeUpdate();
            ConnectionFactory.closeConnection(conn, stmt);
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VehicleDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    @Override
    public boolean delete(Vehicle t) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
