package amigodacomida.service.category;

import amigodacomida.dto.category.CategoryDTO;
import amigodacomida.dto.meal.MealDTO;
import amigodacomida.entity.category.Category;
import amigodacomida.entity.meal.Meal;
import amigodacomida.service.generic.GenericMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryMapper implements GenericMapper<Category, CategoryDTO> {


    @Override
    public CategoryDTO convertToDto(Category category) {
        return new CategoryDTO(category.getType(),convertMealsToMealsDTO(category.getMeals()));
    }

    @Override
    public Category convertToModel(CategoryDTO categoryDTO) {
        return new Category(categoryDTO.getType());
    }

    private List<MealDTO> convertMealsToMealsDTO(List<Meal> mealList){
        ArrayList<MealDTO> listOfMealsDTO = new ArrayList<>();
        for (Meal meal : mealList) {
            listOfMealsDTO.add(new MealDTO(meal.getName(),meal.getEstimatedtime(),meal.getImage(),meal.getVideo(),meal.getSmallDescription()));
        }
        return listOfMealsDTO;
    }

    public List<CategoryDTO> getAllCategoriesType(List<Category>listOfCategoriesEntity){
        List<CategoryDTO> listOfCategories = new ArrayList<CategoryDTO>();

        for(Category c : listOfCategoriesEntity){
            listOfCategories.add(new CategoryDTO(c.getType()));
        }
        return listOfCategories;
    }

}
