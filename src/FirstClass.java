import java.util.Scanner;

public class FirstClass {
    Scanner scanner;

    public FirstClass() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Метод запрашивает у пользователя имя и возраст и выводит в консоль сообщение
     */
    public void run() {
        String name = setData("Введите имя: ");
        String age_str = setData("Введите возраст: ");
        int age = 0;
        try {
            age = Integer.parseInt(age_str);
        } catch (Exception e){
            e.printStackTrace();
        }
        Decorator.helloUser(name, age);
    }

    /**
     * Метод принимает на вход запрос на ввод данных.
     * Возвращает ответ пользователя.
     * @param message принимаемое сообщение.
     * @return
     */

    public String setData (String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
