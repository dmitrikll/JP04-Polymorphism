package task02.participants;

public class Cat implements Participant {

    @Override
    public void run() {
        System.out.println("Cat runs...");
    }

    @Override
    public void jump() {
        System.out.println("Cat jump...");
    }
}
