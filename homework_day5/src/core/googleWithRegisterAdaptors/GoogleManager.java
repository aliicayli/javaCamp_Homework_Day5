package core.googleWithRegisterAdaptors;

import Entities.concretes.User;
import business.abstracts.AuthService;
import core.utilies.BusinessRules;
import signUpWİthGoogle.RegisterToGoogle;

public class GoogleManager implements AuthService {

    RegisterToGoogle registerToGoogle=new RegisterToGoogle();

    @Override
    public boolean validate(User user) {
        boolean result=false;
        result = registerToGoogle.register(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(),
                user.getPassword());
        if(result!=true){
            return false;
        }
        System.out.println("Google ile kayıt olundu");
        return true;
    }

    @Override
    public boolean login(User user) {
        return false;
    }

    private boolean isFirstandLastNameEmpty(User user) {
        if (user.getEmail()==null || user.getPassword()==null) {
            System.out.println("Kullanıcı adı veya parola eksik!");
            return false;
        }
        System.out.println("Sisteme giriş yapıldı!");
        return true;
    }


}
