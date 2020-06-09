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
import rogeriolucon.locadora.model.TradeOperation;
import rogeriolucon.locadora.model.Vehicle;

/**
 *
 * @author Rogerio
 */
public class TradeOperationDAO implements DAOInterface<TradeOperation>{

    @Override
    public Map<Integer, TradeOperation> selectAll() throws DaoException {
        Map<Integer, TradeOperation> map = new HashMap();
        String sql = "SELECT * FROM tradeOperation";
        try(Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {
            
            while(rs.next()){
                TradeOperation trade = new TradeOperation();
        
                trade.setId(rs.getInt("trade_id"));
                trade.setTank(Vehicle.Tank.valueOf(rs.getString("trade_vehicle_tank")));
                trade.setKm(rs.getDouble("trade_vehicle_km"));
                trade.setDate(rs.getDate("trade_date").toLocalDate());
                trade.setValue(rs.getDouble("trade_value"));
                trade.setType(TradeOperation.Type.valueOf(rs.getString("trade_type")));
                
                VehicleDAO vehicleDao = new VehicleDAO();
                Vehicle v = vehicleDao.selectById(rs.getInt("trade_vehicle_id"));
                if(v == null){
                    return null;
                }
                trade.setVehicle(v);
                map.put(trade.getId(), trade);
                
            }
            ConnectionFactory.closeConnection(conn, stmt, rs);
        } catch (SQLException ex) {
            Logger.getLogger(VehicleDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        return map;
    }

    @Override
    public int insert(TradeOperation trade) throws DaoException {
        String sql = "INSERT INTO tradeOperation(trade_vehicle_id, trade_vehicle_km,"
                + "trade_vehicle_tank, trade_date, trade_value, trade_type)"
                + "VALUES(?,?,?,?,?,?)";
        try(Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            conn.setAutoCommit(false);
            
            stmt.setInt(1, trade.getVehicle().getId());
            stmt.setDouble(2, trade.getKm());
            stmt.setString(3, trade.getTank().toString());
            stmt.setDate(4, Date.valueOf(trade.getDate()));
            stmt.setDouble(5, trade.getValue());
            stmt.setString(6, trade.getType().toString());
 
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
    public TradeOperation selectById(int id) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(TradeOperation t) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(TradeOperation t) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
