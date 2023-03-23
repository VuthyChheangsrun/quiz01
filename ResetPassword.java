public class ResetPassword {
    String email;
    String newPassword;
    Integer secureNum;

    ResetPassword(String email_, String newPw, Integer secureNum_){
        email = email_;
        newPassword = newPw;
        secureNum = secureNum_;
    }
}
