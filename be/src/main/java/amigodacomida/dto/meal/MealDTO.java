package amigodacomida.dto.meal;

import amigodacomida.dto.category.CategoryDTO;
import amigodacomida.dto.ingredient.IngredientDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class MealDTO {
     @JsonInclude(JsonInclude.Include.NON_EMPTY)
     String name;
     @JsonInclude(JsonInclude.Include.NON_EMPTY)
     String estimatedtime;
     @JsonInclude(JsonInclude.Include.NON_EMPTY)
     String image;
     @JsonInclude(JsonInclude.Include.NON_EMPTY)
     String video;
     @JsonInclude(JsonInclude.Include.NON_EMPTY)
     CategoryDTO categoryDTO;

     @JsonInclude(JsonInclude.Include.NON_EMPTY)
     String smalldescription;

     @JsonInclude(JsonInclude.Include.NON_EMPTY)
     List<IngredientDTO> ingredientDTOList;

     public MealDTO() {

     }

     public MealDTO(String name, String estimatedtime, String image, String video, String smalldescription) {
          this.name = name;
          this.estimatedtime = estimatedtime;
          this.image = image;
          this.video = video;
          this.smalldescription = smalldescription;
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

     public CategoryDTO getCategoryDTO() {
          return categoryDTO;
     }

     public void setCategoryDTO(CategoryDTO categoryDTO) {
          this.categoryDTO = categoryDTO;
     }

     public String getSmalldescription() {
          return smalldescription;
     }

     public void setSmalldescription(String smalldescription) {
          this.smalldescription = smalldescription;
     }

     public MealDTO(List<IngredientDTO> ingredientDTOList) {
          this.ingredientDTOList = ingredientDTOList;
     }

     public void setIngredientDTOList(List<IngredientDTO> ingredientDTOList) {
          this.ingredientDTOList = ingredientDTOList;
     }

     public List<IngredientDTO> getIngredientDTOList() {
          return ingredientDTOList;
     }
}
