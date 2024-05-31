package amigodacomida.dao.category;

import amigodacomida.entity.category.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO  extends JpaRepository<Category,Integer> {
    Category findByTypeLike(String p);
}
