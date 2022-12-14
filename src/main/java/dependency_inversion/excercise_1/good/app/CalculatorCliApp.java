package dependency_inversion.excercise_1.good.app;

import dependency_inversion.excercise_1.good.BasicCalculator;
import dependency_inversion.excercise_1.good.io.cli.CLIio;

public class CalculatorCliApp {

    public static void main(String[] args) {
        CLIio.printInstructionsForCli();
        String line = CLIio.getLineFromCli();
        String result = BasicCalculator.calculate(line);
        CLIio.printLineToCli(result);
    }
}
