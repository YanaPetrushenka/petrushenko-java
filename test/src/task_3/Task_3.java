package task_3;

import java.util.Arrays;

public class Task_3 {

    public static void main(String[] args) {
        var application = new Task_3();
        application.processInput(args);
    }

    private Integer[] parseNumberArray(String[] args) {
        return Arrays.stream(args)
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
    }

    private void processInput(String[] args) {
        Integer[] numbers = parseNumberArray(args);

        Arrays.stream(numbers)
                .filter(this::isMultiple)
                .forEach(System.out::println);
    }

    private boolean isMultiple(int number) {
        return number % 3 == 0;
    }
}
