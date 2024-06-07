package amigodacomida.entity.ingredient;

import amigodacomida.entity.meal_ingredient.Meal_Ingredient;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(generator = "ingredientsequence")
    @SequenceGenerator(name = "ingredientsequence", sequenceName = "ingredientsequence",allocationSize = 1)
    private Integer id;

    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "ingredient")
    @JsonManagedReference
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Meal_Ingredient> ingredients;

    public Ingredient() {
    }

    public Ingredient(String name) {
        this.name = name;
    }

    public Ingredient(String name, List<Meal_Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Meal_Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Meal_Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
