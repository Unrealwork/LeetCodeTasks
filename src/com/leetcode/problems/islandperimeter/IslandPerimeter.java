package com.leetcode.problems.islandperimeter;

class IslandPerimeter {
    static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int height = grid.length;
        for (int i = 0; i < height; i++) {
            int width = grid[i].length;
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == 1) {
                    perimeter += openSides(grid, i, j, height, width);
                }
            }
        }
        return perimeter;
    }

    private static int openSides(int[][] grid, int i, int j, int h, int w) {
        return 4 - (isIsland(grid, i + 1, j, h, w) ? 1 : 0) - (isIsland(grid, i - 1, j, h, w) ? 1 : 0) -
                (isIsland(grid, i, j + 1, h, w) ? 1 : 0) - (isIsland(grid, i, j - 1, h, w) ? 1 : 0);
    }

    private static boolean isIsland(int[][] grid, int i, int j, int h, int w) {
        return !(i < 0 || i >= h || j < 0 || j >= w) && (grid[i][j] == 1);
    }
}
