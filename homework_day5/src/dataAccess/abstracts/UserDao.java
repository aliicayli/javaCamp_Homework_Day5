package dataAccess.abstracts;

import Entities.concretes.User;

import java.util.List;

public interface UserDao {
    public void add(User user);
    public void delete(User user);
    public void update(User user);
    User get(int id);
    List<User> getAll();
}
