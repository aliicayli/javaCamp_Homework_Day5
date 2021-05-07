import Entities.concretes.User;
import business.abstracts.AuthService;
import business.abstracts.UserService;
import business.concretes.EmailManager;
import business.concretes.UserManager;
import core.googleWithRegisterAdaptors.GoogleManager;
import dataAccess.concretes.InMemoryUserDao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        AuthService googleManager=new GoogleManager();

        User user= new User(1,"X kişisi","Y soyadı","xy@gmail.com","xyparolasi");

        UserService userService=new UserManager(new InMemoryUserDao(),new GoogleManager(),new EmailManager());
        userService.add(user);

        googleManager.login(new User(1,"X Kişisi","Y soyadı","xy@gmail.com","xyparolasi"));

        int verificationCode=scan.nextInt();
        userService.userVerify(user,verificationCode);
        }
    }

