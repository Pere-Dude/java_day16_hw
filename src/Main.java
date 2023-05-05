import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин:");
        String login = scanner.next();
        System.out.println("Введите пароль:");
        String password = scanner.next();
        System.out.println("Подтвердите пароль:");
        String confirmPassword = scanner.next();

        checkUser(login, password, confirmPassword);
    }

    public static void checkUser(String login, String password, String confirmPassword) {
        CheckLogin.checker(login);
        CheckPassword.checker(password);
        CheckPassword.confirmPassword(password, confirmPassword);
    }
}
