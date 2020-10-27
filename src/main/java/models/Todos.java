package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

    public Todos() {
    }

    public Todos(int todos_id, String title, String detail, boolean isActive) {
        this.todos_id = todos_id;
        this.title = title;
        this.detail = detail;
        this.isActive = isActive;
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

    @Override
    public String toString() {
        return "Todos{" +
                "todos_id=" + todos_id +
                ", title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
