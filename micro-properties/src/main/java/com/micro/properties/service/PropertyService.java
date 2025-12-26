package main.java.com.micro.properties.service;

import main.java.com.micro.properties.model.Property;
import main.java.com.micro.properties.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    // 1. Guardar propiedad
    public Property createProperty(Property property) {
        // A. Guardar en Postgres (Maestro)
        Property saved = propertyRepository.save(property);
        
        // B. TODO: Guardar en Elasticsearch (Lo haremos en el siguiente paso)
        
        return saved;
    }

    // 2. Obtener todas
    public List<Property> getAllProperties() {
        return propertyRepository.findAll();
    }

    // 3. Obtener por ID
    public Property getPropertyById(Long id) {
        return propertyRepository.findById(id).orElse(null);
    }
}