package dependency_inversion.excercise_1.good.io.cli;

public interface IO {
    public void printInstructions();
    public void printResult(String result);
    public String getLine();
}
