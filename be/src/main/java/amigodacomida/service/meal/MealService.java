package amigodacomida.service.meal;

import amigodacomida.dao.meal.MealDao;

import amigodacomida.dto.category.CategoryDTO;
import amigodacomida.dto.meal.MealDTO;

import amigodacomida.entity.meal.Meal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class MealService {
    private final MealMapper mapper;
    private final MealDao mealDao;

    public MealService(MealMapper mapper, MealDao mealDao) {
        this.mapper = mapper;
        this.mealDao = mealDao;
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

}
