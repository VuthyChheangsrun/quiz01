import java.util.Scanner;

public class Register {
    String email;
    String password;
    Integer secureNum;

    Scanner sc = new Scanner(System.in);

    Register (){
        email = null;
        password = null;
        secureNum = null;
    }

    Register (String email_, String pw, Integer secureNumber){
        email = email_;
        password = pw;
        secureNum = secureNumber;
    }

    void Get_Register_Info (){
        System.out.print("Please enter your email: ");
        String email_ = sc.nextLine();
        email = email_;

        System.out.print("Please enter your password: ");
        String pw = sc.nextLine();
        password = pw;

        System.out.print("Please enter your security number: ");
        Integer secure_ = sc.nextInt();
        secureNum = secure_;
    }
}
