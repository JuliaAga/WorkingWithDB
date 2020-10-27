import models.Todos;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory;

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

            Session session = sessionFactory.openSession();
            session.beginTransaction();

            List<Todos> result = session.createQuery("from Todos", Todos.class).list();
            System.out.println(result);

            result.forEach(task -> {
                System.out.println(task);
            });

            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }


    }
}
