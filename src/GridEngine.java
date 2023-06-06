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
        this.width = width / 4;
        this.height = height / 4;
        this.population = population;
        while (buildings.size() < (width * height)) {
            buildings.add(new Library(rand.nextInt(2000) + 500, rand.nextInt(population / 3)));
            buildings.add(new Store(rand.nextDouble() * 1000, rand.nextInt(population)));
            buildings.add(new Apartment(rand.nextDouble() * 5000, rand.nextInt(8)));
            buildings.add(new Restaurant(rand.nextInt(400) + 100, rand.nextInt(6) + 16, 3));
            buildings.add(new Bar(rand.nextInt(100) + 15));
            buildings.add(new Hotel(rand.nextInt(61) + 10));
            buildings.add(new Museum(rand.nextInt(300) + 50, rand.nextInt(1000) + 300));
            buildings.add(new Bank(rand.nextDouble() * 10000, rand.nextInt(population - 100) + 100));
            buildings.add(new Hospital(rand.nextInt(population / 4) + 50, rand.nextInt(population / 4) + 50));
            buildings.add(new Supermarket(rand.nextInt(300) + 100));
            buildings.add(new Office(rand.nextInt(400) + 100, rand.nextInt(1051) + 50));
            buildings.add(new FireStation(rand.nextInt(10) + 2));
            buildings.add(new PostOffice(rand.nextInt(1200) + 100, rand.nextInt(15000) + 300));
        }
    }

    public void createGrid() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int buildingID = rand.nextInt(buildings.size());
                grid[i][j] = new CityNode(new Location(i, j), buildings.get(buildingID));
            }
        }
    }

    public int getPopulation() {
        return population;
    }
}