package dependency_inversion.excercise_1.bad;

import java.util.Scanner;

public class BasicCalculator {

    public static void calculate() {
        System.out.println("Enter basic operation separated by spaces:");
        System.out.println("e.g. 4 + 1");
        System.out.println("e.g. 58 - 3");
        System.out.println("e.g. 19 * 7");
        System.out.println("e.g. 20 / 4");
        System.out.println("e.g. 10 % 9");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        var lineSplit = line.split(" ");
        int firstNumber = Integer.parseInt(lineSplit[0]);
        String operation = lineSplit[1];
        int secondNumber = Integer.parseInt(lineSplit[2]);

        String result;
        switch (operation) {
            case "+" -> result = String.valueOf(firstNumber + secondNumber);
            case "-" -> result = String.valueOf(firstNumber - secondNumber);
            case "*" -> result = String.valueOf(firstNumber * secondNumber);
            case "/" -> result = String.valueOf(firstNumber / secondNumber);
            case "%" -> result = String.valueOf(firstNumber % secondNumber);
            default -> result = "Operation not recognised";
        }

        System.out.println(result);
    }
}
