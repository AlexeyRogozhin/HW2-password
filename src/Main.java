import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//создал объект
        String truePass = "password123";

        while (true) {
            System.out.print("Введите пароль : ");
            String str = scanner.nextLine();

            if (str.equals(truePass)) {
                System.out.println("Вы ввели верный пароль!");
                break;
            } else if ("exit".equals(str)) {
                System.out.println("Вы вышли из системы!");
                break;
            }
            System.out.println("Вы ввели : " + str);
            System.out.println("Пароль не верный. Попробуйте ещё раз или введите 'exit'");
        }
        scanner.close();
    }
}
