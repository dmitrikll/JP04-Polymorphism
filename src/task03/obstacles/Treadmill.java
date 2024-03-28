package task03.obstacles;

public class Treadmill extends Obstacle {
    private int length;

    public Treadmill(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public boolean overcome(int dist) {
        return dist >= length;
    }
}
