package amigodacomida.service.meal;

import amigodacomida.dto.category.CategoryDTO;
import amigodacomida.dto.meal.MealDTO;
import amigodacomida.entity.category.Category;
import amigodacomida.entity.meal.Meal;
import amigodacomida.service.category.CategoryMapper;
import amigodacomida.service.generic.GenericMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MealMapper implements GenericMapper<Meal, MealDTO> {
    private final CategoryMapper categoryMapper;

    public MealMapper(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Override
    public MealDTO convertToDto(Meal meal) {
        return new MealDTO(meal.getName(), meal.getEstimatedtime(),meal.getImage(), meal.getVideo(),meal.getCategory().getType());
    }

    @Override
    public Meal convertToModel(MealDTO mealDTO) {
        return new Meal(mealDTO.getName(),mealDTO.getEstimatedtime(),mealDTO.getImage(), mealDTO.getVideo(),categoryMapper.convertToModel(mealDTO.getCategoryDTO()));
    }


}
