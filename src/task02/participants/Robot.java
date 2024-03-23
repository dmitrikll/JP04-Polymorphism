package task02.participants;

public class Robot implements Participant {
    @Override
    public void run() {
        System.out.println("Robot runs...");
    }

    @Override
    public void jump() {
        System.out.println("Robot jumps...");
    }
}
