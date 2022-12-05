package dependency_inversion.excercise_2.bad.model.rover;

public class Rover {

    private final Instruction[] instructions;
    private Orientation orientation;

    public Rover(Orientation orientation, Instruction[] instructions) {
        this.orientation = orientation;
        this.instructions = instructions;
    }
}

