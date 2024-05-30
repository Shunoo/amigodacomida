package amigodacomida.dao.category;

import amigodacomida.dto.category.CategoryDTO;
import amigodacomida.entity.category.Category;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.List;

public class CategoryDAOImpl implements CategoryDAO {



    @Override
    public Category get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Category> getAll() throws SQLException {


        return null;
    }

    @Override
    public int save(Category category) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Category category) throws SQLException {
        return 0;
    }

    @Override
    public int update(Category category) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Category category) throws SQLException {
        return 0;
    }
}
