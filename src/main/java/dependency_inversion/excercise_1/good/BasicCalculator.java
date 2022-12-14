package dependency_inversion.excercise_1.good;

public class BasicCalculator {

    public static String calculate(String line) {
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
        return result;
    }

}
