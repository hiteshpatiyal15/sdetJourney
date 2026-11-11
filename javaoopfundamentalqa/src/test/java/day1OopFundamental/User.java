package day1OopFundamental;
public class User {

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private String username;
    private String password;

    private void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

}
