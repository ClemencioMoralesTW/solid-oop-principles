package dependency_inversion.excercise_2.bad.app;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        MarsRoverRedux handler = new MarsRoverRedux();
        try {
            handler.buildGrid(args[0]);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
