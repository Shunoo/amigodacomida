package amigodacomida.controller.category;

import amigodacomida.dto.category.CategoryDTO;
import amigodacomida.service.category.CategoryService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(value="/categories")
    public List<CategoryDTO> getAll(){
        return categoryService.getAllCategories();
    }
    @RequestMapping(value="/categories/{category-id}")
    public CategoryDTO getCategory(@PathVariable("category-id") Integer id){

        return categoryService.getCategoryById(id);
    }

    @RequestMapping(value="/categories/search/{category-type}")
    public CategoryDTO getCategory(@PathVariable("category-type") String type){
        return categoryService.getCategoryByType(type);
    }
}
