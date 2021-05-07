package dataAccess.concretes;

import Entities.concretes.User;
import dataAccess.abstracts.UserDao;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserDao implements UserDao {
    List<User> users = new ArrayList<User>();

    @Override
    public void add(User user) {
        System.out.println("Kullanici eklendi : " + user.getFirstName() + " " + user.getLastName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Kullanici silindi : " + user.getFirstName() + " " + user.getLastName());
    }

    @Override
    public void update(User user) {
        System.out.println("Kullanici guncellendi : " + user.getFirstName() + " " + user.getLastName());
    }

    @Override
    public User get(int id) {
        for (User user:this.users){
            if(user.getId()==id){
                System.out.println("Kullanici : "+ user.getFirstName() + " " + user.getLastName());
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }
}
