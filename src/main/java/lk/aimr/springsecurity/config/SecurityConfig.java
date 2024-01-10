package lk.aimr.springsecurity.config;

import lk.aimr.springsecurity.service.InMemoryUserDetailsService;
import lk.aimr.springsecurity.service.UsersMemoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {
    @Autowired
    private UsersMemoryService usersMemoryService;
    @Bean
    public UserDetailsService userDetailsService(){
        return new InMemoryUserDetailsService(usersMemoryService.users());
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    public AuthenticationProvider authenticationProvider(){
        return null;
    }

}
