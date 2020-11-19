package behavioral.strategy;

public class Runner {
    public static void main(String[] args) {
       TV tv = new TV();

       tv.setTVchannel(new BBC());
       tv.executePlay();
        tv.setTVchannel(new NBC());
        tv.executePlay();
        tv.setTVchannel(new Fox());
        tv.executePlay();
    }
}
