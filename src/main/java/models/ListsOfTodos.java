package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "listsOfTodos")
public class ListsOfTodos {
    @Id
    int list_id;

    @Column(name = "title")
    String title;

    @Column(name = "color")
    String color;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "list_id", referencedColumnName = "list_id")
    private List<Todos> Todos;

    public ListsOfTodos() {
    }

    public ListsOfTodos(int list_id, String title, String color, List<models.Todos> todos) {
        this.list_id = list_id;
        this.title = title;
        this.color = color;
        Todos = todos;
    }

    public int getList_id() {
        return list_id;
    }

    public void setList_id(int list_id) {
        this.list_id = list_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<models.Todos> getTodos() {
        return Todos;
    }

    public void setTodos(List<models.Todos> todos) {
        Todos = todos;
    }

    @Override
    public String toString() {
        return "ListsOfTodos{" +
                "list_id=" + list_id +
                ", title='" + title + '\'' +
                ", color='" + color + '\'' +
              //  ", Todos=" + Todos +
                '}';
    }
}
