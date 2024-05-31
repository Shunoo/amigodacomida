package amigodacomida.dao.meal;

import amigodacomida.entity.meal.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealDao extends JpaRepository<Meal,Integer> {
}
