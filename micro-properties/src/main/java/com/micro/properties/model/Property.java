package com.micro.properties.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor; // <--- NUEVO
import lombok.Data;
import lombok.NoArgsConstructor;  // <--- NUEVO
import java.time.LocalDateTime;

@Entity
@Table(name = "properties")
@Data
@NoArgsConstructor  // OBLIGATORIO para JPA
@AllArgsConstructor // Útil
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String location;
    private String price;
    private String description; // Tip: Si el texto es muy largo, a veces necesitas @Column(length=1000)
    
    private int bedrooms;
    private int bathrooms;
    private int stories;
    
    @Column(name = "image_url")
    private String img;

    @Column(name = "agent_id")
    private Long agentId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}