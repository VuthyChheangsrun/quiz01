import java.util.Scanner;

public class ResetPassword {
    String email;
    String newPassword;
    Integer secureNum;

    Scanner sc = new Scanner(System.in);

    ResetPassword(){
        email = null;
        newPassword = null;
        secureNum = null;
    }

    ResetPassword(String email_, String newPw, Integer secureNum_){
        email = email_;
        newPassword = newPw;
        secureNum = secureNum_;
    }
    void Get_ResetPass_Info (){
            System.out.print("Please enter your email: ");
            String email_ = sc.nextLine();
            email = email_;
    
            System.out.print("Please enter your new password: ");
            String pw = sc.nextLine();
            newPassword = pw;
    
            System.out.print("Please enter your security number: ");
            Integer secure_ = sc.nextInt();
            secureNum = secure_;
    }
    
}
