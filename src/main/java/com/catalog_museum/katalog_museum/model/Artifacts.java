package com.catalog_museum.katalog_museum.model;

import javax.persistence.*;

@Entity
@Table(name = "artifact", schema = "mus")
public class Artifacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int artifact_id;
    private String artifact_name;
    private String artifact_desc;
    private String artifact_picurl;
    private String artifact_urlref;
    private String artifact_location;

    public int getArtifact_id() {
        return artifact_id;
    }

    public void setArtifact_id(int artifact_id) {
        this.artifact_id = artifact_id;
    }

    public String getArtifact_name() {
        return artifact_name;
    }

    public void setArtifact_name(String artifact_name) {
        this.artifact_name = artifact_name;
    }

    public String getArtifact_desc() {
        return artifact_desc;
    }

    public void setArtifact_desc(String artifact_desc) {
        this.artifact_desc = artifact_desc;
    }

    public String getArtifact_picurl() {
        return artifact_picurl;
    }

    public void setArtifact_picurl(String artifact_picurl) {
        this.artifact_picurl = artifact_picurl;
    }

    public String getArtifact_urlref() {
        return artifact_urlref;
    }

    public void setArtifact_urlref(String artifact_urlref) {
        this.artifact_urlref = artifact_urlref;
    }

    public String getArtifact_location() {
        return artifact_location;
    }

    public void setArtifact_location(String artifact_location) {
        this.artifact_location = artifact_location;
    }
}
