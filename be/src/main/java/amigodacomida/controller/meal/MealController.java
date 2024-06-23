package amigodacomida.controller.meal;

import amigodacomida.dao.meal.MealDao;
import amigodacomida.dto.meal.MealDTO;
import amigodacomida.entity.meal.Meal;
import amigodacomida.service.meal.MealService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MealController {
    private final MealService mealService;

    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @RequestMapping(value ="/")
    List<MealDTO> getAllMeals(){
        return null;
    }

    @RequestMapping(value = "/meal/search/{meal-id}")
    MealDTO findMealById(@PathVariable("meal-id")Integer id){
        return mealService.getMealById(id);
    }

    @RequestMapping(value = "/meal/{category-type}")
    List<MealDTO> findMealByCategoryType(@PathVariable("category-type")String type){
        return mealService.findMealListByCategory(type);
    }
}
