package dependency_inversion.excercise_1.good.app.file;

import dependency_inversion.excercise_1.good.BasicCalculator;

public class CalculatorFileApp {

    public static void main(String[] args) {
        FileIO fileReadingInterface = new FileIO();
        fileReadingInterface.printInstructions();
        String line = fileReadingInterface.getLine();
        String result = BasicCalculator.calculate(line);
        fileReadingInterface.printResult(result);
    }
}
