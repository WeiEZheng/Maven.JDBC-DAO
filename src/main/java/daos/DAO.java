package daos;

import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {
    T findById(int id) throws SQLException;
    List findAll() throws SQLException;
    T update(T object) throws SQLException;
    T create(T object) throws SQLException;
    void delete(int id) throws SQLException;
}
