package amigodacomida.service.category;

import amigodacomida.dao.category.CategoryDAO;
import amigodacomida.dto.category.CategoryDTO;
import amigodacomida.entity.category.Category;
import amigodacomida.entity.meal.Meal;
import jakarta.persistence.EntityNotFoundException;
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

    public CategoryDTO addCategory(CategoryDTO categoryDTO){
        Category categoryToBeCreated = mapper.convertToModel(categoryDTO);
        categoryDAO.save(categoryToBeCreated);
        return mapper.convertToDto(categoryToBeCreated);
    }

    public CategoryDTO editCategory (CategoryDTO categoryDTO,Integer id) throws Exception {
        Category categoryToBeEdited = categoryDAO.findById(id).orElseThrow(() -> new EntityNotFoundException("Category not found with id: "+id));
        Category aux = mapper.convertToModel(categoryDTO);
        categoryToBeEdited.setType(aux.getType());
        categoryToBeEdited.setMeals(aux.getMeals());
        categoryDAO.save(categoryToBeEdited);
        return mapper.convertToDto(categoryToBeEdited);
    }

    public CategoryDTO deleteCategory (Integer id){
        Category categoryToBeEdited = categoryDAO.findById(id).orElseThrow(() -> new EntityNotFoundException("Category not found with id: "+id));
        categoryDAO.delete(categoryToBeEdited);
        return mapper.convertToDto(categoryToBeEdited);
    }
}
