package amigodacomida.dto.category;

import amigodacomida.dto.meal.MealDTO;
import amigodacomida.entity.category.Category;
import amigodacomida.entity.meal.Meal;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

public class CategoryDTO   {
     String type;
     @JsonInclude(JsonInclude.Include.NON_EMPTY)
     List<MealDTO> listOfMeals;

     public CategoryDTO(String type, List<MealDTO> listOfMeals) {
          this.type = type;
          this.listOfMeals =listOfMeals;
     }

     public CategoryDTO(String type){
          this.type = type;
     }

     public String getType() {
          return type;
     }

     public void setType(String type) {
          this.type = type;
     }

     public List<MealDTO> getListOfMeals() {
          return listOfMeals;
     }

     public void setListOfMeals(List<MealDTO> listOfMeals) {
          this.listOfMeals = listOfMeals;
     }
}
