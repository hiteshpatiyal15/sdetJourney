package day1OopFundamental;

public class Main {
    public static void main(String[] args) {
        LoginPage page = new LoginPage();

        page.openPage();
        page.displayPage();
        page.login();

        User user = new User("tester", "secret");

        System.out.println("Username: " + user.getUsername());
    }
}