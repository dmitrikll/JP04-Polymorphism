package task03.participants;

import task03.abstracts.Obstacle;
import task03.abstracts.Participant;

public class Human extends Participant {

    public Human(String name, int maxRunDist, int maxJumpHeight) {
        super(name, maxRunDist, maxJumpHeight);
    }

    @Override
    public void run(Obstacle obstacle) {
        run(obstacle);
    }

    @Override
    public void jump(Obstacle obstacle) {
        jump(obstacle);
    }
}
