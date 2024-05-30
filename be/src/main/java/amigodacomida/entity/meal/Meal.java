package amigodacomida.entity.meal;

import amigodacomida.entity.category.Category;
import amigodacomida.entity.direction.Direction;
import amigodacomida.entity.note.Note;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String name;
    private String estimatedtime;
    private String image;
    private String video;

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

    @OneToMany(mappedBy = "meal")
    private List<Note> notes;

    @OneToMany(mappedBy = "meal")
    private List<Direction> directions;

    @ManyToOne
    @JoinColumn(name = "category_id")
        private Category category;

    public Meal(String name, String estimatedtime, String image, String video, List<Note> notes, List<Direction> directions) {
        this.name = name;
        this.estimatedtime = estimatedtime;
        this.image = image;
        this.video = video;
        this.notes = notes;
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

    public void setVideo(String video) {
        this.video = video;
    }
}