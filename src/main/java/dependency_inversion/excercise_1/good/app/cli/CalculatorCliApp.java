package dependency_inversion.excercise_1.good.app.cli;

import dependency_inversion.excercise_1.good.BasicCalculator;

public class CalculatorCliApp {

    public static void main(String[] args) {
        CLIio commandLineInterface = new CLIio();
        commandLineInterface.printInstructions();
        String line = commandLineInterface.getLine();
        String result = BasicCalculator.calculate(line);
        commandLineInterface.printResult(result);
    }
}
