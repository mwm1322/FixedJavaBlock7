
package lsrhs.java;

// main class for Mini-Maze Project; all it currently does is create a maze
// object and print it out

public class MazeMain {
		public static void main(String args[]) {
			Maze maze = new BrokenTestMaze();
			maze.printMaze();
			DFSSolver solver = new DFSSolver(maze);
			System.out.println(solver.solveMaze(new MazeCoords(0,0)));
		}
}



































