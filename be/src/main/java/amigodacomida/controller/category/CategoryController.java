package amigodacomida.controller.category;

import amigodacomida.dao.category.CategoryDAO;
import amigodacomida.entity.category.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    private final CategoryDAO category;
    public CategoryController(CategoryDAO category){
        this.category = category;
    }
    @RequestMapping(value="/categories")
    public List<Category> getAll(){
        return category.findAll();
    }
    @RequestMapping(value="/categories/{category-id}")
    public Category getCategory(@PathVariable("category-id") Integer id){

        return category.findById(id).orElse(null);
    }

    @RequestMapping(value="/categories/search/{category-type}")
    public Category getCategory(@PathVariable("category-type") String type){

        return category.findByTypeLike(type);
    }
}
