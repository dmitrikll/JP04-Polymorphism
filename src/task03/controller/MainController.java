package task03.controller;

import task03.abstracts.Obstacle;
import task03.obstacles.Treadmill;
import task03.obstacles.Wall;
import task03.abstracts.Participant;
import task03.participants.Human;
import task03.participants.Cat;
import task03.participants.Robot;

public class MainController {

    Participant[] participants = {
            new Human("Jim", 50, 2),
            new Cat("Albie", 79, 5),
            new Robot("R2D2", 110, 8)
    };

    Obstacle[] obstacles = {
            new Treadmill("Treadmill \"SPEED\"", 44),
            new Wall("Wall \"ROCKY\"", 3)
    };

    public void output() {
        for (Participant participant : participants) {
            System.out.print("\n");
            for (Obstacle obstacle : obstacles) {
                if (obstacle.overcome(participant)) {
                    System.out.println("Participant " + participant.getName() +
                            " passed the obstacle " + obstacle.getName() +
                            " at a distance " + obstacle.getDist() + "m.");
                } else {
                    System.out.println("Participant " + participant.getName() +
                            " failed to pass the obstacle " + obstacle.getName() + ".");
                    break;
                }
            }
        }

    }
}