package lk.aimr.springsecurity.service;

import lk.aimr.springsecurity.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersMemoryService {

    public List<UserDetails> users(){
       UserDetails u1 = new User();
        return null;
    }
}
