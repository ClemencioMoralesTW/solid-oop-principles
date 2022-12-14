package dependency_inversion.excercise_1.good.app;

import dependency_inversion.excercise_1.good.BasicCalculator;
import dependency_inversion.excercise_1.good.io.cli.CLIio;
import dependency_inversion.excercise_1.good.io.cli.FileIO;

public class CalculatorFileApp {

    public static void main(String[] args) {
        FileIO fileReadingInterface = new FileIO();
        fileReadingInterface.printInstructions();
        String line = fileReadingInterface.getLine();
        String result = BasicCalculator.calculate(line);
        fileReadingInterface.printResult(result);
    }
}
