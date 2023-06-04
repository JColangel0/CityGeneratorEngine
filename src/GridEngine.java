import java.util.ArrayList;
import java.util.Random;

public class GridEngine {
    private Random rand = new Random();
    private int width;
    private int height;
    private int population;
    // Should this be an ArrayList? It is a non-primitive type but it's fixed size
    // and I think a regular array would be simpler.
    private CityNode[][] grid = new CityNode[width][height];
    private ArrayList<Building> buildings = new ArrayList<Building>();

    public GridEngine(int width, int height, int population) {
        this.width = width;
        this.height = height;
        this.population = population;
        while (buildings.size() < width * height) {
            buildings.add(new Library(rand.nextInt(2000) + 500, rand.nextInt(population / 3)));
            buildings.add(new Store(rand.nextDouble() * 1000, rand.nextInt(population)));
        }
    }

    public void createGrid() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                grid[i][j] = new CityNode(new Location(i, j), new Building());
            }
        }
    }

    public int getPopulation() {
        return population;
    }
}