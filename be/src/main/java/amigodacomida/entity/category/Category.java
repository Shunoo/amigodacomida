package amigodacomida.entity.category;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category {
    public Category() {
    }

    @GeneratedValue
    @Id
    private Integer id;
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
