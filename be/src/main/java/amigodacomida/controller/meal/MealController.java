package amigodacomida.controller.meal;

import amigodacomida.dao.meal.MealDao;
import amigodacomida.entity.meal.Meal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MealController {
    private final MealDao mealDao;

    public MealController(MealDao mealDao) {
        this.mealDao = mealDao;
    }

    @RequestMapping(value ="/")
    List<Meal> getAllMeals(){
        return mealDao.findAll();
    }

    @RequestMapping(value = "/meal/{meal-id}")
    Meal findMealById(@PathVariable("meal-id")Integer id){
        return mealDao.findById(id).orElse(null);
    }
}
