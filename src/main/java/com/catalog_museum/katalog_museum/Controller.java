package com.catalog_museum.katalog_museum;

import com.catalog_museum.katalog_museum.model.Artifacts;
import com.catalog_museum.katalog_museum.reps.ArtifactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private ArtifactsService artifactsService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("artifactlist", artifactsService.getAllArtifacs());
        return ("index");
    }

    @GetMapping("/showNewArtifact")
    public String showNewArtifact(Model model){
        Artifacts artifacts = new Artifacts();
        model.addAttribute("artifacts",artifacts);
        return "add_new";
    }

    @PostMapping ("/saveartifact")
    public String saveArtifact(@ModelAttribute("artifacts") Artifacts artifacts){
        artifactsService.saveArtifact(artifacts);
        return "redirect:/";
    }

    @GetMapping("/UpdateArtf/{id}")
    public String UpdateArtf(@PathVariable(value="id") int id,Model model) {
    Artifacts artifacts=artifactsService.getArtifactbyid(id);
    model.addAttribute("artifacts",artifacts);
    return "update_artifact";
    }

    @GetMapping("/RemoveArtf/{id}")
    public String RemoveArtf(@PathVariable (value = "id")int id) {
        artifactsService.removeArtifactbyid(id);
        return "redirect:/";
    }
}
