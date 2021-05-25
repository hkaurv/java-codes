package Recursion;

public class RobotInAGrid {

	//Robot in a Grid: Imagine a robot sitting on the upper left corner of grid with r rows and c columns.
	//The robot can only move in two directions, right and down, but certain cells are "off limits" such that
	//the robot cannot step on them. Design an algorithm to find a path for the robot from the top left to
	//the bottom right.
	/**
	 * 1   1   1   1   1   1   1
	 * 1   2   3   4   5   6   7
	 * 1   3   6   10  15  21  28
	 * 1   4   10  20  35  56  84
	 * 1   5   15  35  70  126 210
	 */
	public int uniquePaths(int m, int n) {
		int[][] grid = new int[m][n];

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (i == 0 || j == 0)
					grid[i][j] = 1;
				else
					grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
			}
		}
		return grid[m - 1][n - 1];
	}

}
