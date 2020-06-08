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
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import rogeriolucon.locadora.ConnectionFactory;
import rogeriolucon.locadora.interfaces.DAOInterface;
import rogeriolucon.locadora.model.RentOperation;

/**
 *
 * @author rolucon
 */
public class RentOperationDAO implements DAOInterface<RentOperation>{

    @Override
    public Map<Integer, RentOperation> selectAll() throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(RentOperation rent) throws DaoException {
        String sql = "INSERT INTO rentOperation(rent_vehicle_id, rent_vehicle_init_km,"
                + " rent_vehicle_end_km, rent_vehicle_init_tank,"
                + " rent_vehicle_end_tank, rent_date, rent_final_Value,"
                + " rent_value, rent_type, rent_contractState)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?)";
        try(Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            conn.setAutoCommit(false);
            
            stmt.setInt(1, rent.getVehicle().getId());
            stmt.setDouble(2, rent.getKm());
            stmt.setDouble(3, rent.getFinalKm()); // Ajustar
            stmt.setString(4, rent.getTank().toString());
            stmt.setString(5, rent.getFinalTank().toString()); // Ajustar
            stmt.setDate(6, Date.valueOf(rent.getDate()));
            stmt.setDouble(7, rent.getFinalValue());
            stmt.setDouble(8, rent.getValue());
            stmt.setString(9, rent.getType().toString());
            stmt.setBoolean(10, rent.isContractOpen());
        
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
    public boolean update(RentOperation t) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(RentOperation t) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
