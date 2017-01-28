package com.servicesapi;

import java.util.List;
import com.entities.Users;


//UsersServices: It is a service for Users.

public interface UsersService {
    public boolean saveOrUpdate(Users users);
    public List<Users> list();
    public boolean delete(Users users);
}