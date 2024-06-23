package amigodacomida.entity.meal;

import amigodacomida.entity.category.Category;
import amigodacomida.entity.direction.Direction;
import amigodacomida.entity.ingredient.Ingredient;
import amigodacomida.entity.meal_ingredient.Meal_Ingredient;
import amigodacomida.entity.note.Note;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Meal {
    @Id
    @GeneratedValue(generator = "mealsequence")
    @SequenceGenerator(name = "mealsequence", sequenceName = "mealsequence",allocationSize = 1)
    private Integer id;
    @Column(unique = true)
    private String name;
    private String estimatedtime;
    private String image;
    private String video;
    private String smallDescription;
    private String tag;

    @OneToMany(mappedBy = "meal")
    @JsonManagedReference
    private List<Note> notes;

    @OneToMany(mappedBy = "meal")
    @JsonManagedReference
    private List<Direction> directions;

    @ManyToOne
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    @JsonBackReference
    private Category category;

    @OneToMany(mappedBy = "meal")
    @JsonManagedReference
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Meal_Ingredient> ingredients;

    public Meal() {
    }


    public Meal(String name, String estimatedtime, String image, String video, String smallDescription, String tag, List<Note> notes, List<Direction> directions, Category category, List<Meal_Ingredient> ingredients) {
        this.name = name;
        this.estimatedtime = estimatedtime;
        this.image = image;
        this.video = video;
        this.smallDescription = smallDescription;
        this.tag = tag;
        this.notes = notes;
        this.directions = directions;
        this.category = category;
        this.ingredients = ingredients;
    }

    public Meal(String name, String estimatedtime, String image, String video, Category category,String smallDescription) {
        this.name = name;
        this.estimatedtime = estimatedtime;
        this.image = image;
        this.video = video;
        this.category = category;
        this.smallDescription = smallDescription;
    }

    public Meal(String name, String estimatedtime, String image, String video, String smallDescription) {
        this.name = name;
        this.estimatedtime = estimatedtime;
        this.image = image;
        this.video = video;
        this.smallDescription = smallDescription;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }



    public List<Direction> getDirections() {
        return directions;
    }

    public void setDirections(List<Direction> directions) {
        this.directions = directions;
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

    public String getEstimatedtime() {
        return estimatedtime;
    }

    public void setEstimatedtime(String estimatedtime) {
        this.estimatedtime = estimatedtime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVideo() {
        return video;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public List<Meal_Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Meal_Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getSmallDescription() {
        return smallDescription;
    }

    public void setSmallDescription(String smallDescription) {
        this.smallDescription = smallDescription;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
