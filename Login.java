import java.util.Scanner;

public class Login {
    String username;
    String password;

    Scanner sc = new Scanner(System.in);

    Login (){
        username = null;
        password = null;
    }
    Login(String username_, String pw){
        username = username_;
        password = pw;
    }

    void Get_Login_Info (){
        System.out.print("Please enter your username: ");
        String username_ = sc.nextLine();
        username = username_;

        System.out.print("Please enter your password: ");
        String pw = sc.nextLine();
        password = pw;
    }
}
