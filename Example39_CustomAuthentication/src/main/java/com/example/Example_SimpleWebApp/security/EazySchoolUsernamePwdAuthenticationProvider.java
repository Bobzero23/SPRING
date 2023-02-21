package com.example.Example_SimpleWebApp.security;

import com.example.Example_SimpleWebApp.model.Person;
import com.example.Example_SimpleWebApp.model.Roles;
import com.example.Example_SimpleWebApp.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EazySchoolUsernamePwdAuthenticationProvider
            implements AuthenticationProvider
{
    @Autowired
    private PersonRepository personRepository;
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String email = authentication.getName();
        String pwd = authentication.getCredentials().toString(); /**why using get credentials here*/
        Person person = personRepository.readByEmail(email);

        if(null != person && person.getPersonId() > 0 && pwd.equals(person.getPwd())) {
            return new UsernamePasswordAuthenticationToken(
                    person.getName(), pwd, getGrantedAuthorities(person.getRoles()));
        }else {
            throw new BadCredentialsException("Invalid Credentials");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

    private List<GrantedAuthority> getGrantedAuthorities(Roles roles) {
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_" + roles.getRoleName()));
        return grantedAuthorities;
    }
}
