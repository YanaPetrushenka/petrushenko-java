package task_1;

import java.lang.NumberFormatException;
import java.util.Scanner;

public class Task_1 {

    private static final String INPUT_MESSAGE = "Введите число (q - для выхода): ";
    private static final String GREETING_MESSAGE = "Привет";
    private static final String ERROR_MESSAGE = "Ввод должен быть в числовом формате";
    private static final String EXIT_KEY = "q";
    private static final int THRESHOLD_NUMBER = 7;

    private Scanner keyboardScanner;

    public Task_1() {
        keyboardScanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        var application = new Task_1();
        application.processInput();
    }

    private void processInput() {
        while (true) {
            System.out.print(INPUT_MESSAGE);

            try {
                var keyboardInput = keyboardScanner.nextLine();

                if (EXIT_KEY.equals(keyboardInput)) {
                    break;
                }

                var inputNumber = Integer.parseInt(keyboardInput);

                if (inputNumber > THRESHOLD_NUMBER) {
                    System.out.println(GREETING_MESSAGE);
                }
            } catch (NumberFormatException e) {
                System.err.println(ERROR_MESSAGE);
            }
        }
    }
}