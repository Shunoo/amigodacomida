package amigodacomida.dao.ingredient;

import amigodacomida.entity.ingredient.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientDao extends JpaRepository<Ingredient,Integer> {
}
