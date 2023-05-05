public class CheckLogin {
    public static void checker(String login) {
        if(!checkLength(login)) {
            throw new WrongPasswordException("Максимальная длинна логина 20 символов");
        } else if(!checkSymbols(login)) {
            throw new WrongPasswordException("В логине некорректные символы");
        } else {
            System.out.println("Логин корректный");
        }
    }

    private static boolean checkLength(String login) {
        return login.length() <= 20;
    }

    private static boolean checkSymbols(String login) {
        String s = "qwertyuiopasdfghjklzxcvbnm_1234567890";
        login = login.toLowerCase();
        for (int i = 0; i < login.length(); i++) {
            String currentSymbol = Character.toString(login.charAt(i));
            if(s.contains(currentSymbol) == false) {
                return false;
            }
        }
        return true;
    }

}
