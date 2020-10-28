import models.ListsOfTodos;
import models.Todos;
import service.ListOfTodosService;
import service.TodosService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        TodosService service = new TodosService();

        service.getAll().forEach(todos -> System.out.println(todos));

        ListOfTodosService listService = new ListOfTodosService();
        listService.getAll().forEach(todos -> System.out.println(todos));


    }
}
