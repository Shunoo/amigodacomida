package amigodacomida.dto.category;

import amigodacomida.entity.category.Category;

public class CategoryDTO {
    private int id;
    private String type;
    public CategoryDTO(){}
    public CategoryDTO(int id,String type){
        this.type = type;
        this.id = id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public CategoryDTO fromModel(Category c){
        return new CategoryDTO(c.getId(),c.getType());
    }
}
