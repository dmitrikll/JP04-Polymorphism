package task03;

import task03.obstacles.Obstacle;
import task03.obstacles.Treadmill;
import task03.obstacles.Wall;
import task03.participants.Cat;
import task03.participants.Human;
import task03.participants.Participant;
import task03.participants.Robot;

public class Main {

    public static void main(String[] args) {

        Participant[] participants = {
                new Human("Jim", 50, 3),
                new Cat("Alfie", 75, 9),
                new Robot("R2D2", 125, 18)
        };

        Obstacle[] obstacles = {
                new Treadmill("TREADMILL SPEEDY", 44),
                new Wall("WALL ROCKY", 2)
        };

        for (Participant participant : participants) {
            System.out.print("\n");
            boolean passedAllObstacles = true;
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Treadmill) {
                    participant.run();
                    if (!((Treadmill) obstacle).overcome(participant.getMaxRunDist())) {
                        passedAllObstacles = false;
                        System.out.println(participant.getName() + " failed to pass the obstacle " +
                                obstacle.getName() + " at distance " + ((Treadmill) obstacle).getLength() +
                                "m. Passed: " + participant.getMaxRunDist() + "m.");
                        break;
                    } else if (((Treadmill) obstacle).overcome(participant.getMaxRunDist())) {
                        System.out.println(participant.getName() + " pass the obstacle " +
                                obstacle.getName() + " at distance " +
                                ((Treadmill) obstacle).getLength() + "m.");
                    }

                } else if (obstacle instanceof Wall) {
                    participant.jump();
                    if (!((Wall) obstacle).overcome(participant.getMaxJumpHeight())) {
                        passedAllObstacles = false;
                        System.out.println(participant.getName() + " failed to pass the obstacle " +
                                obstacle.getName() + " at distance " + ((Wall) obstacle).getHeight() +
                                "m. Passed: " + participant.getMaxJumpHeight() + "m.");
                        break;
                    } else if (((Wall) obstacle).overcome(participant.getMaxJumpHeight())) {
                        System.out.println(participant.getName() + " pass the obstacle " +
                                obstacle.getName() + " at distance " +
                                ((Wall) obstacle).getHeight() + "m.");
                    }
                }
            }
        }
    }
}
