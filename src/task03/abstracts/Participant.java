package task03.abstracts;

public abstract class Participant {
    private String name;
    private int maxRunDist;
    private int maxJumpHeight;

    public Participant(String name, int maxRunDist, int maxJumpHeight) {
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxJumpHeight = maxJumpHeight;
    }

    public abstract void run(Obstacle obstacle);

    public abstract void jump(Obstacle obstacle);

    public String getName() {
        return name;
    }

    public int getMaxRunDist() {
        return maxRunDist;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }
}
