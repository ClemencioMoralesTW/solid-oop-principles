package dependency_inversion.excercise_2.bad.model.grid;

import dependency_inversion.excercise_2.bad.model.rover.Rover;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Grid {
    private final Map<Coordinate, Optional<Rover>> coordinateCellMap;

    public Grid(int maxX, int maxY) {
        coordinateCellMap = new HashMap<>();
        for (int x = 0; x <= maxX; x++) {
            for (int y = 0; y <= maxY; y++) {
                var coordinate = new Coordinate(x, y);
                coordinateCellMap.put(coordinate, Optional.empty());
            }
        }
    }

    public boolean place(Rover rover, Coordinate coordinate) {
        var cell = coordinateCellMap.get(coordinate);
        if (cell == null || !cell.isEmpty()) {
            return false;
        }
        coordinateCellMap.put(coordinate, Optional.of(rover));
        return true;
    }
}
