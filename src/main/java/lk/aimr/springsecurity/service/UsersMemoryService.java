package lk.aimr.springsecurity.service;

import lk.aimr.springsecurity.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersMemoryService {

    public List<UserDetails> users(){
       UserDetails u1 = new User("kevin","1234","ADMIN");
        UserDetails u2 = new User("Shehan","1234","ADMIN");
        UserDetails u3 = new User("Perera","1234","ADMIN");
        return null;
    }
}
