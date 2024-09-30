package shevelev;

public class PrintProposedArray {
    public static void main(String[] args) {
//        int[][] grid = {{3, 4, 3}, {2, 2, 2}, {2, 1, 1}, {4, 3, 2}, {2, 1, 4}, {2, 4, 1}, {3, 3, 3}, {1, 4, 2}, {2, 2, 1}, {2, 1, 1}, {3, 3, 1}, {4, 1, 4}, {2, 1, 4}, {3, 2, 2}, {3, 3, 1}, {4, 4, 1}, {1, 2, 2}, {1, 1, 1}, {1, 3, 4}, {1, 2, 1}, {2, 2, 4}, {2, 1, 3}, {1, 2, 1}, {4, 3, 2}, {3, 3, 4}, {2, 2, 1}, {3, 4, 3}, {4, 2, 3}, {4, 4, 4}}; //1
        int[][] grid = {{1, 1, 3}, {3, 2, 2}, {1, 1, 4}};//0


        for (int i = 0; i < grid.length; i++) {
            for (int k = 0; k < grid[0].length; k++) {
                int i1 = grid[i][k];
                switch (i1) {
                    case (1):
                        System.out.print("\u2192" + "         ");
                        break;
                    case (2):
                        System.out.print("\u2190" + "         ");
                        break;
                    case (3):
                        System.out.print("\u2193" + "         ");
                        break;
                    case (4):
                        System.out.print("\u2191" + "         ");
                        break;
                }
            }
            System.out.print("\n");
        }
    }
}
