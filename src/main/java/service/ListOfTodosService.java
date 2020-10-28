package service;

import dao.ListsOfTodosDAO;
import models.ListsOfTodos;
import models.Todos;
import org.hibernate.Session;
import utils.SessionUtil;

import java.sql.SQLException;
import java.util.List;

public class ListOfTodosService extends SessionUtil implements ListsOfTodosDAO {
    @Override
    public void add(ListsOfTodos list) throws SQLException {
        openTransactionSession();

        Session session = getSession();
        session.save(list);

        closeTransactionSession();
    }

    @Override
    public List<ListsOfTodos> getAll() throws SQLException {
        openTransactionSession();

        Session session = getSession();
        List<ListsOfTodos> result = session.createQuery("from ListsOfTodos", ListsOfTodos.class).list();

        closeTransactionSession();
        return result;
    }

    @Override
    public ListsOfTodos getById(int id) throws SQLException {
        openTransactionSession();

        Session session = getSession();
        ListsOfTodos list = (ListsOfTodos) session.get(ListsOfTodos.class, id);

        closeTransactionSession();
        return list;
    }

    @Override
    public void update(ListsOfTodos list) throws SQLException {
        openTransactionSession();

        Session session = getSession();
        session.update(list);

        closeTransactionSession();
    }

    @Override
    public void remove(ListsOfTodos list) throws SQLException {
        openTransactionSession();

        Session session = getSession();
        session.remove(list);

        closeTransactionSession();

    }
}
