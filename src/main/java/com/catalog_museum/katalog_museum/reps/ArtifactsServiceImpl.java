package com.catalog_museum.katalog_museum.reps;


import com.catalog_museum.katalog_museum.model.Artifacts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtifactsServiceImpl implements ArtifactsService {

    @Autowired
    private ArtifactsRepository artifactsRepository;

    @Override
    public List<Artifacts> getAllArtifacs() {
        return artifactsRepository.findAll();
    }

    @Override
    public void saveArtifact(Artifacts artifacts) {
        this.artifactsRepository.save(artifacts);
    }

    @Override
    public Artifacts getArtifactbyid(int id) {
        Optional<Artifacts> optional = artifactsRepository.findById(id);
        Artifacts artifacts;
        if(optional.isPresent()){
            artifacts=optional.get();
        }
        else {
            throw new RuntimeException("Not found" +id);
        }
        return artifacts;
    }

    @Override
    public void removeArtifactbyid(int id) {
        this.artifactsRepository.deleteById(id);
    }
}
