package business.concretes;

import Entities.concretes.User;
import business.abstracts.AuthService;
import business.abstracts.UserService;
import core.googleWithRegisterAdaptors.GoogleManager;
import dataAccess.concretes.InMemoryUserDao;

import java.util.List;

public class UserManager implements UserService {


    public UserManager(InMemoryUserDao inMemoryUserDao, GoogleManager googleManager, EmailManager emailManager) {
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void userVerify(User user, int verificationCode) {

    }
}
