package task02.obstacles;

import task02.participants.Participant;

public class Wall implements Obstacle {
    private final int high;

    public Wall(int high) {
        this.high = high;
    }

    @Override
    public void overcome(Participant participant) {
        participant.jump();
        System.out.println("High of the wall: " + high);
    }
}
