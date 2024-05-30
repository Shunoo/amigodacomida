package amigodacomida.controller.category;

import amigodacomida.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {



    @RequestMapping(value="/categories")
    public String listall(){

        return "hello";
    }

}
