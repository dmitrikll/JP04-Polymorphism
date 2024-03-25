package task02.obstacles;

import task02.participants.Participant;

public class Treadmill implements Obstacle {
    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public void overcome(Participant participant) {
        participant.run();
        System.out.println("Length of the treadmill: " + length + "m.");
    }
}
