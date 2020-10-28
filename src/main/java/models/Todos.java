package models;

import javax.persistence.*;

@Entity
@Table(name = "todos")
public class Todos {
    @Id
    int todos_id;

    @Column(name = "title")
    String title;

    @Column(name = "detail")
    String detail;

    @Column(name = "isActive")
    boolean isActive;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "list_id", referencedColumnName = "list_id")
    private ListsOfTodos listsOfTodos;

    public Todos() {
    }

    public Todos(int todos_id, String title, String detail, boolean isActive, ListsOfTodos listsOfTodos) {
        this.todos_id = todos_id;
        this.title = title;
        this.detail = detail;
        this.isActive = isActive;
        this.listsOfTodos = listsOfTodos;
    }

    public int getTodos_id() {
        return todos_id;
    }

    public void setTodos_id(int todos_id) {
        this.todos_id = todos_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public ListsOfTodos getListsOfTodos() {
        return listsOfTodos;
    }

    public void setListsOfTodos(ListsOfTodos listsOfTodos) {
        this.listsOfTodos = listsOfTodos;
    }

    @Override
    public String toString() {
        return "Todos{" +
                "todos_id=" + todos_id +
                ", title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                ", isActive=" + isActive +
                ", listsOfTodos=" + listsOfTodos +
                '}';
    }
}
