package behavioral.strategy;

public class BBC implements TVchannel {
    @Override
    public void play() {
        System.out.println("BBC channel playing");
    }
}
