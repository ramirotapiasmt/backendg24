package com.ciclo3.reto.retog24.controlador;

import com.ciclo3.reto.retog24.entidad.Category;
import com.ciclo3.reto.retog24.servicio.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category/")
@CrossOrigin(origins = "*")
public class ApiCategory {
    /**
     * instancia de servicio categoria operaciones CRUD
     */
    @Autowired
    private CategoryService service;

    @GetMapping("/all")
    public List<Category> findAllcategory(){
    return service.getCategories();

    }
    @PostMapping("/save")
    public ResponseEntity saveCategory(@RequestBody Category category){
        service.saveCategory(category);
        return ResponseEntity.status(201).build();

    }
}
