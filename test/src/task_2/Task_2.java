package task_2;

import java.util.Scanner;

public class Task_2 {

    private static final String INPUT_MESSAGE = "Введите имя (q - для выхода): ";
    private static final String NAME = "Вячеслав";
    private static final String GREETING = "Привет, %s%n";
    private static final String NO_NAME_MESSAGE = "Нет такого имени";
    private static final String EXIT_KEY = "q";

    private final Scanner keyboardScanner;

    public Task_2() {
        keyboardScanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        var application = new Task_2();
        application.processInput();
    }

    private void processInput() {
        while (true) {
            System.out.print(INPUT_MESSAGE);
            var name = keyboardScanner.nextLine();
            System.out.println("Ввод: " + name);

            if (EXIT_KEY.equals(name)) {
                break;
            } else if (NAME.equals(name)) {
                System.out.printf(GREETING, NAME);
            } else {
                System.out.println(NO_NAME_MESSAGE);
            }
        }
    }
}
