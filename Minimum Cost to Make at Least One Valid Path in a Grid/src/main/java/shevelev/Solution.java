package shevelev;

import java.util.Arrays;

public class Solution {
    int minCosts[][];
    int oldMinCosts[][];
    int XMAX;
    int YMAX;

    public int minCost(int[][] grid) {
        XMAX = grid.length - 1;
        YMAX = grid[0].length - 1;

        minCosts = new int[XMAX + 1][YMAX + 1];
        oldMinCosts = new int[XMAX + 1][YMAX + 1];

        for (int[] row : minCosts) {
            for (int i = 0; i < row.length; i++) {
                row[i] = Integer.MAX_VALUE;
            }
        }

        for (int[] row : oldMinCosts) {
            for (int i = 0; i < row.length; i++) {
                row[i] = Integer.MAX_VALUE;
            }
        }


        while (true) {
            for (int x = XMAX; x >= 0; x--) {
                for (int y = YMAX; y >= 0; y--) {

                    //отрабатываем целевую нижнюю правую ячейку
                    if (x == XMAX && y == YMAX) {
                        minCosts[XMAX][YMAX] = 0;
                        //находясь в нижней правой заполняем цены соседним
                        if (y > 0) {
                            if (grid[x][y - 1] == 1) {
                                minCosts[x][y - 1] = 0;
                            } else {
                                if (minCosts[x][y - 1] != 0) {
                                    minCosts[x][y - 1] = 1;
                                }
                            }
                        }
                        if (x > 0) {
                            if (grid[x - 1][y] == 3) {
                                minCosts[x - 1][y] = 0;
                            } else {
                                if (minCosts[x - 1][y] != 0) {
                                    minCosts[x - 1][y] = 1;
                                }
                            }
                        }
                        continue;
                    }


                    //находясь слева смотрим правую ячейку
                    if (y < YMAX) {
                        if (grid[x][y + 1] == 2) {
                            if (minCosts[x][y + 1] > minCosts[x][y]) {
                                minCosts[x][y + 1] = minCosts[x][y];
                            }
                        } else {
                            if (minCosts[x][y + 1] > minCosts[x][y] + 1) {
                                minCosts[x][y + 1] = minCosts[x][y] + 1;
                            }
                        }
                    }

                    //находясь снизу смотрим верхнюю ячейку
                    if (x > 0) {
                        if (grid[x - 1][y] == 3) {
                            if (minCosts[x - 1][y] > minCosts[x][y]) {
                                minCosts[x - 1][y] = minCosts[x][y];
                            }
                        } else {
                            if (minCosts[x - 1][y] > minCosts[x][y] + 1) {
                                minCosts[x - 1][y] = minCosts[x][y] + 1;
                            }
                        }
                    }

                    //находясь сверху смотрим нижнюю ячейку
                    if (x < XMAX) {
                        if (grid[x + 1][y] == 4) {
                            if (minCosts[x + 1][y] > minCosts[x][y]) {
                                minCosts[x + 1][y] = minCosts[x][y];
                            }
                        } else {
                            if (minCosts[x + 1][y] > minCosts[x][y] + 1) {
                                minCosts[x + 1][y] = minCosts[x][y] + 1;
                            }
                        }
                    }

                    //находясь справа смотрим левую ячейку
                    if (y > 0) {
                        if (grid[x][y - 1] == 1) {
                            if (minCosts[x][y - 1] > minCosts[x][y]) {
                                minCosts[x][y - 1] = minCosts[x][y];
                            }
                        } else {
                            if (minCosts[x][y - 1] > minCosts[x][y] + 1) {
                                minCosts[x][y - 1] = minCosts[x][y] + 1;
                            }
                        }
                    }
                }
            }

            if (Arrays.deepEquals(oldMinCosts, minCosts)) {
                return minCosts[0][0];
            } else {
                for (int i = 0; i < oldMinCosts.length; i++) {
                    oldMinCosts[i] = Arrays.copyOf(minCosts[i], minCosts[0].length);
                }
            }
        }
    }
}


