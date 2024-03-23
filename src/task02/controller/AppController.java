package task02.controller;

import task02.obstacles.Obstacle;
import task02.obstacles.Treadmill;
import task02.obstacles.Wall;
import task02.participants.Cat;
import task02.participants.Human;
import task02.participants.Participant;
import task02.participants.Robot;

public class AppController {
    Participant[] participants = {
        new Human(),
        new Cat(),
        new Robot(),
    };

    Obstacle[] obstacles = {
            new Treadmill(23),
            new Wall(5),
            new Treadmill(12),
            new Wall(2)
    };

    public void output(){
        for (Participant participant:participants) {
            for (Obstacle obstacle:obstacles) {
                obstacle.overcome(participant);
            }
        }
    }
}
