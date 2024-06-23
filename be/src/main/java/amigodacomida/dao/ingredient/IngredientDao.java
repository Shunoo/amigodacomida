package amigodacomida.dao.ingredient;

import amigodacomida.entity.ingredient.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IngredientDao extends JpaRepository<Ingredient,Integer> {
    @Query(nativeQuery = true,value = "SELECT " +
            "i.name,mi.quantity,mi.quantitynote " +
            "from meal m " +
            "join meal_ingredient mi on mi.meal_fk = m.id " +
            "join ingredient i on mi.ingredient_fk = i.id " +
            "where m.id = ?1")
    List<Object[]> getMealAndIngredientsById(Integer id);

}
