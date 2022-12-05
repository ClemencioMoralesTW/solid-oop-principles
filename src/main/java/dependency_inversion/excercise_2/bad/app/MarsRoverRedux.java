package dependency_inversion.excercise_2.bad.app;

import dependency_inversion.excercise_2.bad.model.grid.Coordinate;
import dependency_inversion.excercise_2.bad.model.grid.Grid;
import dependency_inversion.excercise_2.bad.model.rover.Instruction;
import dependency_inversion.excercise_2.bad.model.rover.Orientation;
import dependency_inversion.excercise_2.bad.model.rover.Rover;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class MarsRoverRedux {

    private Grid grid;

    public Grid buildGrid(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        List<String> initialConfiguration = Files.readAllLines(path);
        String maxCoordinates = initialConfiguration.get(0);

        grid = getGrid(maxCoordinates);
        placeRovers(initialConfiguration);

        return grid;
    }

    private Grid getGrid(String firstLine) {
        var firstLineArray = firstLine.split(" ");
        int maxX = Integer.parseInt(firstLineArray[0]);
        int maxY = Integer.parseInt(firstLineArray[1]);
        Grid grid = new Grid(maxX, maxY);
        return grid;
    }

    private void placeRovers(List<String> initialConfiguration) {
        for (int i = 1; i < initialConfiguration.size(); i = i + 2) {
            String roverPositionAndOrientation = initialConfiguration.get(i);
            String instructions = initialConfiguration.get(i + 1);
            placeRover(roverPositionAndOrientation, instructions);
        }
    }

    private void placeRover(String roverPositionAndOrientation, String instructions) {
        var roverCoordinateAndOrientationArray = roverPositionAndOrientation.split(" ");
        int roverX = Integer.parseInt(roverCoordinateAndOrientationArray[0]);
        int roverY = Integer.parseInt(roverCoordinateAndOrientationArray[1]);
        Coordinate roverCoordinate = new Coordinate(roverX, roverY);
        String[] fromInstructions = instructions.split("");
        Instruction[] roverInstructions = Stream.of(fromInstructions)
                .map(Instruction::valueOf)
                .toArray(Instruction[]::new);
        Rover rover = new Rover(Orientation.valueOf(roverCoordinateAndOrientationArray[2]), roverInstructions);
        grid.place(rover, roverCoordinate);
    }

}
