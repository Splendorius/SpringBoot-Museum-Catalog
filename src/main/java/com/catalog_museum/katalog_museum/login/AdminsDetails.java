package com.catalog_museum.katalog_museum.login;

import com.catalog_museum.katalog_museum.model.Admins;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Collection;
import java.util.Collections;

public class AdminsDetails implements UserDetails {

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    private final String Admin_nick;
    private final String Password;

    public AdminsDetails(Admins admins) {
        this.Admin_nick = admins.getadminnick();
        this.Password = admins.getPassword();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("ADMIN"));
    }

    @Override
    public String getPassword() {
        return encoder.encode(Password);
    }

    @Override
    public String getUsername() {
        return Admin_nick;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
