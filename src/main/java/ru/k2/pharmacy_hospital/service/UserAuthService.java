package ru.k2.pharmacy_hospital.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;
import ru.k2.pharmacy_hospital.domain.Person;

import java.util.HashSet;
import java.util.Set;

public class UserAuthService implements UserDetailsService {

    private  final  PersonServiceImpl personService;

    public UserAuthService(PersonServiceImpl personService) {
        this.personService = personService;
    }

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Person personByName = personService.getPersonByName(username);
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();

        personByName.getRoles().
                forEach(r -> grantedAuthorities.
                        add(new SimpleGrantedAuthority(r.getRoleName())));

        return new User(personByName.getLogin(),personByName.getPassword(), grantedAuthorities);

    }
}
