public class Building {
    private String name;
    private int height;

    public Building() {
        this.name = "";
        this.height = 10;
    }

    public Building(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }
}