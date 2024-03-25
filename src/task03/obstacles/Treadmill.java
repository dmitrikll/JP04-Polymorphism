package task03.obstacles;

import task03.abstracts.Obstacle;
import task03.abstracts.Participant;

public class Treadmill extends Obstacle {

    public Treadmill(String name, int dist) {
        super(name, dist);
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.getMaxRunDist() >= getDist();
    }
}
