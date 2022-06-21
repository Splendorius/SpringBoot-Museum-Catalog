package com.catalog_museum.katalog_museum.reps;

import com.catalog_museum.katalog_museum.model.Admins;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminsRepository extends JpaRepository<Admins, Integer> {
    Optional<Admins> findByadminnick(String adminnick);
}
