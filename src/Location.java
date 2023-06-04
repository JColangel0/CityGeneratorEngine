public class Location {
    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "<" + x + "," + y + ">";
    }

    public double calcDistance(Location loc) {
        double xDiff = loc.getX() - (double) x;
        double yDiff = loc.getY() - (double) y;
        xDiff = Math.pow(xDiff, 2);
        yDiff = Math.pow(yDiff, 2);
        return xDiff + yDiff;
    }
}