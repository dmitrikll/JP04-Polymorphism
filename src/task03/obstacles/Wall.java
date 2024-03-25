package task03.obstacles;

import task03.abstracts.Obstacle;
import task03.abstracts.Participant;

public class Wall extends Obstacle {

    public Wall(String name, int dist) {
        super(name, dist);
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.getMaxJumpHeight() >= getDist();
    }
}
