package amigodacomida.service.category;

import com.fasterxml.jackson.databind.ObjectMapper;
import amigodacomida.dao.category.CategoryDAOImpl;
import amigodacomida.dto.category.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    public CategoryService(){}

    public String getallcategories (){
        CategoryDAOImpl cdaoimpl = new CategoryDAOImpl();
        List<CategoryDTO> listOfCategories = new ArrayList<>();
        CategoryDTO auxDTO = new CategoryDTO();
        ObjectMapper mapper = new ObjectMapper();
        String response = null;
        try {
            cdaoimpl.getAll().forEach(category -> listOfCategories.add(auxDTO.fromModel(category)));
            response = mapper.writeValueAsString("hello");;
        }catch(Exception exception){
            System.out.println("Error");
        }

        return response;
    }

}
