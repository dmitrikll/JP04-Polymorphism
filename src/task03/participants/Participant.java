package task03.participants;

public class Participant {
    private String name;
    private int maxRunDist;
    private int maxJumpHeight;

    public Participant(String name, int maxRunDist, int maxJumpHeight) {
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return name;
    }

    public int getMaxRunDist() {
        return maxRunDist;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public void run() {
        System.out.println("Participant ran...");
    }

    public void jump() {
        System.out.println("Participant jumps...");
    }
}
