/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.interfaces;

import rogeriolucon.locadora.DAO.DaoException;
import java.util.ArrayList;

/**
 *
 * @author rolucon
 * @param <T> classe model a ser utilizada
 */
public interface DAOInterface<T> {
    public ArrayList<T> selectAll() throws DaoException;
    public int insert(T t) throws DaoException;
    public T selectById(int id) throws DaoException;
    public boolean update(T t) throws DaoException ;
    public boolean delete(T t) throws DaoException;
}
