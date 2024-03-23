package task02.participants;

public interface Participant {
    default void run() {
        System.out.println("Participant runs...");
    }

    default void jump() {
        System.out.println("Participant jumps...");
    }
}
