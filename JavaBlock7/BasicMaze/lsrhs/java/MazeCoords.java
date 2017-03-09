package lsrhs.java;

import java.util.Collection;
// very simple class to hold a pair of coords for the maze

public class MazeCoords {
	MazeCoords parent;
	int x, y;
	
	public MazeCoords() {
		x = y = 0;
	}

	public MazeCoords(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean isContained(Collection<MazeCoords> c) {
		for (MazeCoords coords: c) {
			if (coords.x == x && coords.y == y)
				return true;
		}
		return false;
	}
	
	public MazeCoords up() {
		return new MazeCoords(x, y - 1);
	}
	
	public MazeCoords right() {
		return new MazeCoords(x + 1, y);
	}
	
	public MazeCoords down() {
		return new MazeCoords(x, y + 1);
	}
	
	public MazeCoords left() {
		return new MazeCoords(x - 1, y);
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
