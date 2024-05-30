package amigodacomida.entity.direction;

import amigodacomida.entity.meal.Meal;
import jakarta.persistence.*;

@Entity
public class Direction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String step;

    @ManyToOne
    @JoinColumn(name = "meal_id")
    private Meal meal;

    public Direction() {
    }

    public Direction(Meal meal, String step) {
        this.meal = meal;
        this.step = step;
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
