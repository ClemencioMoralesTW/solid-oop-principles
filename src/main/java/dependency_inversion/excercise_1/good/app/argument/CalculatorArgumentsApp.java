package dependency_inversion.excercise_1.good.app.argument;

import dependency_inversion.excercise_1.good.BasicCalculator;

public class CalculatorArgumentsApp {

    public static void main(String[] args) {
        String line = ArgumentIO.getLine(args);
        String result = BasicCalculator.calculate(line);
        System.out.println(result);
    }
}
