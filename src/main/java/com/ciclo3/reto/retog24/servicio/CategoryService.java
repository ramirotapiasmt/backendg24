package com.ciclo3.reto.retog24.servicio;

import com.ciclo3.reto.retog24.entidad.Category;
import com.ciclo3.reto.retog24.repositorio.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    /**
     * instancias de repositorio donde se encuentran las operaciones CRUD
     */
    @Autowired
    private CategoryRepository repository;

    /**
     * mostrar datos
     */

    public List <Category> getCategories(){
    return repository.findAll();

        /**
         * guardar categoria
         * @param category
         * @return Category
         */
    }
    public Category saveCategory (Category category){
        return repository.save(category);
    }
}
