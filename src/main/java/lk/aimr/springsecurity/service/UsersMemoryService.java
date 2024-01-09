package lk.aimr.springsecurity.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersMemoryService {
    public List<UserDetails> userDetailsList;
}
