package lsrhs.java;

/**
 * Created by block7 on 2/7/17.
 */
import java.util.ArrayList;
public class DFSSolver {

    ArrayList<MazeCoords> visited = new ArrayList<MazeCoords>();
    Maze maze;

    public DFSSolver(Maze maze) {
        this.maze = maze;
    }


    boolean solveMaze(MazeCoords c) {
        if (maze.isEndSquare(c)) {
            return true;
        }
        if (c.isContained(visited)) {
            return false;
        }
        visited.add(c);

        for (MazeCoords n : getNeighbors(c)) {
            if (solveMaze(n)) {
                return true;
            }
        }

        return false;
    }

    private ArrayList<MazeCoords> getNeighbors(MazeCoords c) {
        ArrayList<MazeCoords> neighbors = new ArrayList<MazeCoords>();
        MazeCoords leftNeighbor = c.left();
        if (maze.isPassable(leftNeighbor)) {
            neighbors.add(leftNeighbor);
        }
        MazeCoords downNeighbor = c.down();
        if (maze.isPassable(downNeighbor)) {
            neighbors.add(downNeighbor);
        }

        MazeCoords rightNeighbor = c.right();
        if (maze.isPassable(rightNeighbor)) {
            neighbors.add(rightNeighbor);
        }

        MazeCoords upNeighbor = c.up();
        if (maze.isPassable(upNeighbor)) {
            neighbors.add(upNeighbor);
        }

        return neighbors;
    }

}