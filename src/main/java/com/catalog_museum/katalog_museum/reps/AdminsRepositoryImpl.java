package com.catalog_museum.katalog_museum.reps;

import com.catalog_museum.katalog_museum.login.AdminsDetails;
import com.catalog_museum.katalog_museum.model.Admins;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminsRepositoryImpl implements UserDetailsService {

    private final AdminsRepository adminsRepository;

    public AdminsRepositoryImpl(@Lazy AdminsRepository adminsRepository) {
        this.adminsRepository = adminsRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String adminnick) {

        Optional<Admins> admins = adminsRepository.findByadminnick(adminnick);

        admins.orElseThrow(() -> new UsernameNotFoundException("Not found: " + adminnick));

         return admins.map(AdminsDetails::new).get();
    }
}
