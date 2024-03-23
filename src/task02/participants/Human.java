package task02.participants;

public class Human implements Participant {

    @Override
    public void run() {
        System.out.println("Human runs...");
    }

    @Override
    public void jump() {
        System.out.println("Human jumps...");
    }
}
