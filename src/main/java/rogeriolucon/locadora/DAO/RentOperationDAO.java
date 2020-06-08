/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import rogeriolucon.locadora.ConnectionFactory;
import rogeriolucon.locadora.interfaces.DAOInterface;
import rogeriolucon.locadora.model.RentOperation;
import rogeriolucon.locadora.model.Vehicle;

/**
 *
 * @author rolucon
 */
public class RentOperationDAO implements DAOInterface<RentOperation>{

    @Override
    public Map<Integer, RentOperation> selectAll() throws DaoException {
        Map<Integer, RentOperation> map = new HashMap();
        String sql = "SELECT * FROM rentOperation";
        try(Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {
            
            while(rs.next()){
                RentOperation rent = new RentOperation();
        
                rent.setId(rs.getInt("rent_id"));
                rent.setTank(Vehicle.Tank.valueOf(rs.getString("rent_vehicle_init_tank")));
                rent.setFinalTank(Vehicle.Tank.valueOf(rs.getString("rent_vehicle_end_tank")));
                rent.setKm(rs.getDouble("rent_vehicle_init_km"));
                rent.setFinalKm(rs.getDouble("rent_vehicle_end_km"));
                rent.setDate(rs.getDate("rent_date").toLocalDate());
                rent.setExpirationDate(rs.getDate("rent_date_exp").toLocalDate());
                LocalDate aux = rs.getDate("rent_date_exp").toLocalDate();
                if(aux != null){
                     rent.setWaxedDate(aux);
                }
                rent.setValue(rs.getDouble("rent_value"));
                rent.setFinalValue(rs.getDouble("rent_final_Value"));
                rent.setType(RentOperation.Type.valueOf(rs.getString("rent_type")));
                rent.setContractOpen(rs.getBoolean("rent_contractState"));
                
                VehicleDAO vehicleDao = new VehicleDAO();
                Vehicle v = vehicleDao.selectById(rs.getInt("rent_vehicle_id"));
                if(v == null){
                    return null;
                }
                rent.setVehicle(v);
                map.put(rent.getId(), rent);
            }
            ConnectionFactory.closeConnection(conn, stmt, rs);
        } catch (SQLException ex) {
            Logger.getLogger(VehicleDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        return map;
    }

    @Override
    public int insert(RentOperation rent) throws DaoException {
        String sql = "INSERT INTO rentOperation(rent_vehicle_id, rent_vehicle_init_km,"
                + " rent_vehicle_end_km, rent_vehicle_init_tank,"
                + " rent_vehicle_end_tank, rent_date, rent_date_exp, rent_final_Value,"
                + " rent_value, rent_type, rent_contractState)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try(Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            conn.setAutoCommit(false);
            
            stmt.setInt(1, rent.getVehicle().getId());
            stmt.setDouble(2, rent.getKm());
            stmt.setDouble(3, rent.getFinalKm());
            stmt.setString(4, rent.getTank().toString());
            stmt.setString(5, rent.getFinalTank().toString());
            stmt.setDate(6, Date.valueOf(rent.getDate()));
            stmt.setDate(7, Date.valueOf(rent.getExpirationDate()));
            stmt.setDouble(8, rent.getFinalValue());
            stmt.setDouble(9, rent.getValue());
            stmt.setString(10, rent.getType().toString());
            stmt.setBoolean(11, rent.isContractOpen());
        
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
    public RentOperation selectById(int id) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(RentOperation rent) throws DaoException {
        String sql = "UPDATE rentOperation SET rent_vehicle_end_km = ?,"
                + " rent_vehicle_end_tank = ?, rent_final_Value = ?,"
                + " rent_type = ?, rent_contractState = ?, rent_date_end = ? WHERE rent_id = ?";
        try(Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)){
            conn.setAutoCommit(true);
            
            stmt.setDouble(1, rent.getFinalKm());
            stmt.setString(2, rent.getFinalTank().toString());
            stmt.setDouble(3, rent.getFinalValue());
            stmt.setString(4, rent.getType().toString());
            stmt.setBoolean(5, rent.isContractOpen());
            stmt.setDate(6, Date.valueOf(rent.getWaxedDate()));
            stmt.setInt(7, rent.getId());
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(RentOperationDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean delete(RentOperation t) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
