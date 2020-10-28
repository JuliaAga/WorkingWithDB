package dao;

import models.ListsOfTodos;
import models.Todos;

import java.sql.SQLException;
import java.util.List;

public interface ListsOfTodosDAO {
    void add(ListsOfTodos list) throws SQLException;

    List<ListsOfTodos> getAll() throws SQLException;

    ListsOfTodos getById(int id) throws SQLException;

    void update(ListsOfTodos list) throws SQLException;

    void remove(ListsOfTodos list) throws SQLException;
}
