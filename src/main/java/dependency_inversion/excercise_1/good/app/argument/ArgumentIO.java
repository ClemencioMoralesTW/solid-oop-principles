package dependency_inversion.excercise_1.good.app.argument;

public class ArgumentIO {
    public static String getLine(String[] args) {
        String line = args[0] + " " + args[1] + " " + args[2];
        return line;
    }
}
