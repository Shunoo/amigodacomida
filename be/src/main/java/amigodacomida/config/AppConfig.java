package amigodacomida.config;

import amigodacomida.dao.category.CategoryDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;

@Configuration
public class AppConfig {
    @Bean
    public PersistenceAnnotationBeanPostProcessor persistenceAnnotationBeanPostProcessor() {
        return new PersistenceAnnotationBeanPostProcessor();
    }
    @Bean
    public CategoryDAOImpl myCategoryDao(){
        return new CategoryDAOImpl();
    }
}
