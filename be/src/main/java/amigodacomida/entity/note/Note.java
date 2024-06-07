package amigodacomida.entity.note;

import amigodacomida.entity.meal.Meal;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Note {

    @Id
    @GeneratedValue(generator = "notesequence")
    @SequenceGenerator(name = "notesequence", sequenceName = "notesequence",allocationSize = 1)
    private Integer id;

    private String text;

    @ManyToOne
    @JoinColumn(name = "meal_id")
    @JsonBackReference
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
