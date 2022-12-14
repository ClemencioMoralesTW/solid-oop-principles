package dependency_inversion.excercise_1.good.io.cli;

import java.io.*;
import java.util.Scanner;

public class FileIO implements IO {
    @Override
    public void printInstructions() {
        System.out.println("Input the file name: ");
    }

    @Override
    public void printResult(String result) {
        try {
            String fileName = "result.txt";
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter fileWrite = new FileWriter(fileName);
            fileWrite.write(result);
            fileWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getLine() {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            return reader.readLine();
        } catch (IOException e) {
            System.out.println("There was an error while reading from the file.");
        }
        return "";
    }
}
