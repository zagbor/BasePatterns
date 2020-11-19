package behavioral.strategy;

public class NBC implements TVchannel {
    @Override
    public void play() {
        System.out.println("NBC channel playing");
    }
}
