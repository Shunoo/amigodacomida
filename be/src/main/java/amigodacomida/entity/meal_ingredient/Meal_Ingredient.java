package amigodacomida.entity.meal_ingredient;

import amigodacomida.entity.category.Category;
import amigodacomida.entity.ingredient.Ingredient;
import amigodacomida.entity.meal.Meal;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Meal_Ingredient {
    @Id
    @GeneratedValue(generator = "meal_ingredient_sequence")
    @SequenceGenerator(name = "meal_ingredient_sequence", sequenceName = "meal_ingredient_sequence",allocationSize = 1)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "meal_fk",referencedColumnName = "id")
    @JsonBackReference
    Meal meal;

    @ManyToOne
    @JoinColumn(name = "ingredient_fk",referencedColumnName = "id")
    @JsonBackReference
    Ingredient ingredient;

    private String quantity;
    private String quantitynote;

    public Meal_Ingredient() {
    }


    public Meal_Ingredient(Meal meal, Ingredient ingredient, String quantity, String quantitynote) {
        this.meal = meal;
        this.ingredient = ingredient;
        this.quantity = quantity;
        this.quantitynote = quantitynote;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantitynote() {
        return quantitynote;
    }

    public void setQuantitynote(String quantitynote) {
        this.quantitynote = quantitynote;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
