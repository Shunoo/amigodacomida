package amigodacomida.service.category;

import amigodacomida.dao.category.CategoryDAO;
import amigodacomida.dto.category.CategoryDTO;
import amigodacomida.entity.category.Category;
import amigodacomida.entity.meal.Meal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    private final CategoryMapper mapper;
    private final CategoryDAO categoryDAO;

    public CategoryService(CategoryMapper mapper, CategoryDAO category) {
        this.mapper = mapper;
        this.categoryDAO = category;
    }

    public List<CategoryDTO> getAllCategories (){
        return new ArrayList<>(mapper.getAllCategoriesType(categoryDAO.findAll()));
    }


    public CategoryDTO getCategoryById(Integer id){
        return mapper.convertToDto(Objects.requireNonNull(categoryDAO.findById(id).orElse(null)));
    }

    public CategoryDTO getCategoryByType(String type){
        return mapper.convertToDto(Objects.requireNonNull(categoryDAO.findByTypeLike(type)));
    }
}
