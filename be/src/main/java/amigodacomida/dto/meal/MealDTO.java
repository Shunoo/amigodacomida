package amigodacomida.dto.meal;

import amigodacomida.dto.category.CategoryDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

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
     String categoryType;

     public MealDTO(String name, String estimatedtime, String image, String video) {
          this.name = name;
          this.estimatedtime = estimatedtime;
          this.image = image;
          this.video = video;
     }

     public MealDTO(String name, String estimatedtime, String image, String video, CategoryDTO categoryDTO) {
          this.name = name;
          this.estimatedtime = estimatedtime;
          this.image = image;
          this.video = video;
          this.categoryDTO = categoryDTO;
     }

     public MealDTO(String name, String estimatedtime, String image, String video, String categoryType) {
          this.name = name;
          this.estimatedtime = estimatedtime;
          this.image = image;
          this.video = video;
          this.categoryType = categoryType;
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

     public String getCategoryType() {
          return categoryType;
     }

     public void setCategoryType(String categoryType) {
          this.categoryType = categoryType;
     }
}
