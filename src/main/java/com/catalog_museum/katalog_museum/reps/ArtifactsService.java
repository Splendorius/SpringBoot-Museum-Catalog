package com.catalog_museum.katalog_museum.reps;

import com.catalog_museum.katalog_museum.model.Artifacts;

import java.util.List;

public interface ArtifactsService {
    List<Artifacts> getAllArtifacs();
    void saveArtifact(Artifacts artifacts);
    Artifacts getArtifactbyid(int id);
    void removeArtifactbyid(int id);
}
