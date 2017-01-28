package com.daoapi;
import java.util.List;
import com.entities.Users;

//UsersDao: It is a service for Dao repository.

public interface UsersDao {
    public boolean saveOrUpdate(Users users);
    public List<Users> list();
    public boolean delete(Users users);
}