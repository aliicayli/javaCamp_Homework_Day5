package core.utilies;

import Entities.concretes.User;
import business.abstracts.AuthService;

public class BusinessRules {
    public static boolean Run(boolean... logics) {
        for (boolean logic : logics) {
            if (!logic) {
                return false;
            }
        }
        return false;
    }

}

