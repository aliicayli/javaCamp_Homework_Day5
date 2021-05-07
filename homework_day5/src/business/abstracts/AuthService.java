package business.abstracts;

import Entities.concretes.User;

public interface AuthService {
    boolean validate(User user);
    boolean login(User user);

}
