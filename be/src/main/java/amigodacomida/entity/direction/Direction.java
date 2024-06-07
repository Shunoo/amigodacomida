package amigodacomida.entity.direction;

import amigodacomida.entity.meal.Meal;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Direction {

    @Id
    @GeneratedValue(generator = "directionsequence")
    @SequenceGenerator(name = "directionsequence", sequenceName = "directionsequence",allocationSize = 1)
    private Integer id;

    private String step;

    private Integer stepNumber;

    @ManyToOne
    @JoinColumn(name = "meal_id")
    @JsonBackReference
    private Meal meal;

    public Direction() {
    }

    public Direction(Meal meal, String step) {
        this.meal = meal;
        this.step = step;
    }

    public Direction(String step, Integer stepNumber, Meal meal) {
        this.step = step;
        this.stepNumber = stepNumber;
        this.meal = meal;
    }

    public Integer getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(Integer stepNumber) {
        this.stepNumber = stepNumber;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }
}
