package amigodacomida.entity.note;

import amigodacomida.entity.meal.Meal;
import jakarta.persistence.*;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String text;

    @ManyToOne
    @JoinColumn(name = "meal_id")
    private Meal meal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Note(String text, Meal meal) {
        this.text = text;
        this.meal = meal;
    }

    public Note() {
    }
}
