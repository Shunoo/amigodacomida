package amigodacomida.service.meal;

import amigodacomida.dao.ingredient.IngredientDao;
import amigodacomida.dao.meal.MealDao;

import amigodacomida.dto.category.CategoryDTO;
import amigodacomida.dto.ingredient.IngredientDTO;
import amigodacomida.dto.meal.MealDTO;

import amigodacomida.entity.meal.Meal;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class MealService {
    private final MealMapper mapper;
    private final MealDao mealDao;
    private final IngredientDao ingredientDao;

    public MealService(MealMapper mapper, MealDao mealDao, IngredientDao ingredientDao) {
        this.mapper = mapper;
        this.mealDao = mealDao;
        this.ingredientDao = ingredientDao;
    }

    public MealDTO findMealById(Integer id){
       return mapper.convertToDto(Objects.requireNonNull(mealDao.findById(id).orElse(null)));
    }

    public List<MealDTO> findMealListByCategory(String type){
        List<MealDTO> listOfMeals = new ArrayList<>();
        for(Meal m : mealDao.findAllByCategoryType(type)){
            listOfMeals.add(mapper.convertToDto(m));
        }
        return  listOfMeals;
    }

    public MealDTO getMealById(Integer id){

        MealDTO mealDTO = new MealDTO();
        Meal mealFound = mealDao.getById(id);
        List<Object[]> mealIngredientDetails = ingredientDao.getMealAndIngredientsById(id);
        mealDTO = mapper.convertToDto(mealFound);
        List<IngredientDTO> ingredientsDTO = new ArrayList<>();
        for (Object[] result : mealIngredientDetails) {
            IngredientDTO ingredientDTO = new IngredientDTO();
            ingredientDTO.setName((String) result[0]);
            ingredientDTO.setQuantity((String) result[1]);
            ingredientDTO.setQuantitynote((String) result[2]);
            ingredientsDTO.add(ingredientDTO);
        }
        mealDTO.setIngredientDTOList(ingredientsDTO);
        return mealDTO;
    }

}
