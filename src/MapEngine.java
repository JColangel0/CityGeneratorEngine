import java.util.Random;

public class MapEngine {
    private int width;
    private int height;
    private String[][] grid;
    private Random random = new Random();

    public MapEngine(int width, int height) {
        this.width = width;
        this.height = height;

        grid = new String[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = " ";
            }
        }
    }

    public void drawStreet(int yStartingPoint, int xStartingPoint, int streetLength, int streetWidth, boolean v) {
        if (grid[yStartingPoint][xStartingPoint] == null
                || grid[yStartingPoint][xStartingPoint + streetWidth] == null) {
            return;
        }
        if (v) {
            for (int i = yStartingPoint; i < yStartingPoint + streetLength; i++) {
                grid[i][xStartingPoint] = "|";
                grid[i][xStartingPoint + streetWidth] = "|";
                for (int j = xStartingPoint + 1; j < xStartingPoint + streetWidth; j++) {
                    grid[i][j] = null;
                }
            }
        } else {
            for (int i = yStartingPoint; i < yStartingPoint + streetLength; i++) {
                grid[xStartingPoint][i] = "-";
                grid[xStartingPoint + streetWidth][i] = "-";
                for (int j = xStartingPoint + 1; j < xStartingPoint + streetWidth; j++) {
                    grid[j][i] = null;
                }
            }
        }
    }

    public void drawMap() {
        for (int i = 0; i < 50; i++) {
            drawStreet(random.nextInt(height - 70), random.nextInt(width - 10), random.nextInt(20) + 50,
                    random.nextInt(4) + 2, random.nextBoolean());
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == null) {
                    grid[i][j] = " ";
                }
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}