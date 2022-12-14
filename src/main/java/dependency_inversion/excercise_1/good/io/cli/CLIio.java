package dependency_inversion.excercise_1.good.io.cli;

import java.util.Scanner;

public class CLIio implements IO {
    @Override
    public void printInstructions() {
        System.out.println("Enter basic operation separated by spaces:");
        System.out.println("e.g. 4 + 1");
        System.out.println("e.g. 58 - 3");
        System.out.println("e.g. 19 * 7");
        System.out.println("e.g. 20 / 4");
        System.out.println("e.g. 10 % 9");
    }

    @Override
    public void printResult(String result) {
        System.out.println(result);
    }

    @Override
    public String getLine() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line;
    }
}
