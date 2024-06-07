package amigodacomida.entity.macro;

import jakarta.persistence.*;

@Entity
public class Macro {

    @Id
    @GeneratedValue(generator = "macrosequence")
    @SequenceGenerator(name = "macrosequence", sequenceName = "macrosequence",allocationSize = 1)
    private Integer id;
    @Column(unique = true)
    private String type;

    public Macro() {
    }

    public Macro(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
