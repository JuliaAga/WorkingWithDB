package service;

import dao.TodosDAO;
import models.Todos;
import org.hibernate.Session;
import utils.SessionUtil;

import java.sql.SQLException;
import java.util.List;

public class TodosService extends SessionUtil implements TodosDAO {
    @Override
    public void add(Todos todo) throws SQLException {
        openTransactionSession();

        Session session = getSession();
        session.save(todo);

        closeTransactionSession();

    }

    @Override
    public List<Todos> getAll() throws SQLException {
        openTransactionSession();

        Session session = getSession();
        List<Todos> result = session.createQuery("from Todos", Todos.class).list();

        closeTransactionSession();
        return result;
    }

    @Override
    public Todos getById(int id) throws SQLException {
        openTransactionSession();

        Session session = getSession();
        Todos todo = (Todos) session.get(Todos.class, id);

        closeTransactionSession();
        return todo;
    }

    @Override
    public void update(Todos todo) throws SQLException {
        openTransactionSession();

        Session session = getSession();
        session.update(todo);

        closeTransactionSession();

    }

    @Override
    public void remove(Todos todo) throws SQLException {
        openTransactionSession();

        Session session = getSession();
        session.remove(todo);

        closeTransactionSession();

    }

}
