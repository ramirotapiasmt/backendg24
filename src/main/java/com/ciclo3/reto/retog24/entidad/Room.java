package com.ciclo3.reto.retog24.entidad;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String hotel;
    private int stars;
    private String description;
    @ManyToOne
    @JoinColumn(name="category_id")
    @JsonIgnoreProperties("rooms")
    private Category category;


}
