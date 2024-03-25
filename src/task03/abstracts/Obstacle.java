package task03.abstracts;

public abstract class Obstacle {
    private String name;
    private int dist;

    public Obstacle(String name, int dist) {
        this.name = name;
        this.dist = dist;
    }

    public abstract boolean overcome(Participant participant);

    public String getName() {
        return name;
    }

    public int getDist() {
        return dist;
    }
}
