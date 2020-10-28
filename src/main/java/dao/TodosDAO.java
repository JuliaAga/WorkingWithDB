package dao;

import models.Todos;

import java.sql.SQLException;
import java.util.List;

public interface TodosDAO {

    void add(Todos todo) throws SQLException;

    List<Todos> getAll() throws SQLException;

    Todos getById(int id) throws SQLException;

    void update(Todos todo) throws SQLException;

    void remove(Todos todo) throws SQLException;

}
