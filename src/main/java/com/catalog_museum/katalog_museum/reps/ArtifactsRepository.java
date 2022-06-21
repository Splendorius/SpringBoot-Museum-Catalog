package com.catalog_museum.katalog_museum.reps;

import com.catalog_museum.katalog_museum.model.Artifacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtifactsRepository extends JpaRepository<Artifacts, Integer> {
}
