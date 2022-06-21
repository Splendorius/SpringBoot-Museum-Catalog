package com.catalog_museum.katalog_museum.model;

import javax.persistence.*;

@Entity
@Table(name = "admins", schema = "mus")
public class Admins {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int adminid;
    private String adminnick;
    private String password;

    public String getadminnick() {
        return adminnick;
    }

    public void setAdminnick(String adminnick) {
        this.adminnick = adminnick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return adminid;
    }

    public void setId(int adminid) {
        this.adminid = adminid;
    }
}
