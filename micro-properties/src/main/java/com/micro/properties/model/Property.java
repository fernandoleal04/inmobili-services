package main.java.com.micro.properties.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "properties")
@Data // Lombok genera Getters, Setters, ToString, etc.
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String location;
    private String price; // Podría ser BigDecimal, pero por ahora String está bien
    private String description;
    
    // Características básicas
    private int bedrooms;
    private int bathrooms;
    private int stories;
    
    @Column(name = "image_url")
    private String img;

    // Relación con Agente (Por ahora solo guardamos el ID para llamar al otro servicio)
    @Column(name = "agent_id")
    private Long agentId;

    // Auditoría
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}