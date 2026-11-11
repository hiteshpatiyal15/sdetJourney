package day1OopFundamental;
public class LoginPage extends BasePage {

    public void login() {
        System.out.println("User logged in");
    }

    @Override
    public void displayPage() {
        System.out.println("Login Page");
    }
}
