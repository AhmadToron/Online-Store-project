package Model;

public class Login {
    private String userNameLogin;
    private String passwordLogin;
    private String firstName;

    public Login (String userNameLogin, String passwordLogin, String firstName){
        this.userNameLogin = userNameLogin;
        this.passwordLogin = passwordLogin;
        this.firstName = firstName;
    }

    public String getUserNameLogin() {
        return userNameLogin;
    }
    public void setUserNameLogin(String userNameLogin) {
        this.userNameLogin = userNameLogin;
    }
    public String getPasswordLogin() {
        return passwordLogin;
    }
    public void setPasswordLogin(String passwordLogin) {
        this.passwordLogin = passwordLogin;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
