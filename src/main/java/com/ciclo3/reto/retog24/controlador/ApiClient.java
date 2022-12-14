package com.ciclo3.reto.retog24.controlador;

import com.ciclo3.reto.retog24.entidad.Client;
import com.ciclo3.reto.retog24.servicio.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client/")
@CrossOrigin(origins = "*")
public class ApiClient {
    private ClientService service;

    @GetMapping("/all/")
    public List<Client> findAllClients(){
        return service.getClients();

    }
    @PostMapping("/save")
    public ResponseEntity saveClient (@RequestBody Client client){
        service.saveClient(client);
        return ResponseEntity.status(201).build();
    }
}
