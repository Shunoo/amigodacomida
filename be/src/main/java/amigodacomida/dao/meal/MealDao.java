package amigodacomida.dao.meal;

import amigodacomida.dto.meal.MealDTO;
import amigodacomida.entity.meal.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.lang.NonNullApi;

import java.util.List;

public interface MealDao extends JpaRepository<Meal,Integer> {
    @Query(nativeQuery = true, value = "select meal.category_id, meal.id, category.type, meal.estimatedtime,meal.video,meal.image,meal.name,meal.small_description,meal.tag from meal join category  on meal.category_id = category.id and category.type = ?1")
    List<Meal> findAllByCategoryType(String type);

    Meal getById(Integer id);
}
