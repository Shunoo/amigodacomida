package amigodacomida.entity.category;

import amigodacomida.entity.meal.Meal;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="category")
public class Category {
    public Category() {
    }

    public Category(String type) {
        this.type = type;
    }

    public Category(String type, List<Meal> meals) {
        this.type = type;
        this.meals = meals;
    }

    @Id
    @GeneratedValue(generator = "categorysequence")
    @SequenceGenerator(name = "categorysequence", sequenceName = "categorysequence",allocationSize = 1)
    private Integer id;
    @Column(unique = true)
    private String type;

    @OneToMany(mappedBy = "category")
    @JsonManagedReference
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Meal> meals;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }
}
