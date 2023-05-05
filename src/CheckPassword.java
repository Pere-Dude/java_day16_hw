public class CheckPassword {
    public static void checker(String password) {
        if(!checkLength(password)) {
            throw new WrongPasswordException("Неверная длинна пароля. Максимальная длинна пароля 19 символов");
        } else if(!checkSymbols(password)) {
            throw new WrongPasswordException("В пароле некорректные символы");
        } else {
            System.out.println("Пароль корректный");
        }
    }

    private static boolean checkLength(String password) {
        return password.length() < 20;
    }

    private static boolean checkSymbols(String password) {
        String s = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm_1234567890";
        for (int i = 0; i < password.length(); i++) {
            String currentSymbol = Character.toString(password.charAt(i));
            if(s.contains(currentSymbol) == false) {
                return false;
            }
        }
        return true;
    }

    public static void confirmPassword(String password, String password2) {
        if(password.equals(password2)) {
            System.out.println("Пароли совпадают");
        } else {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}
