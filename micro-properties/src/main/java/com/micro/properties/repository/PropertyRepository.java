package main.java.com.micro.properties.repository;

import com.inmobili.properties.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
    // Aquí podrías agregar métodos mágicos como:
    // List<Property> findByBedroomsGreaterThan(int count);
}