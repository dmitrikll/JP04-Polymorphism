package task03.obstacles;

public class Wall extends Obstacle {
    private int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public boolean overcome(int dist) {
        return dist >= height;
    }
}
