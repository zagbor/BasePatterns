package behavioral.state;

public class Runner {
    public static void main(String[] args) {
        TVchannel tVchannel = new NBC();
        TV tv = new TV();
        tv.setTvChannel(tVchannel);
        tv.play();
        tv.nextChannel();
        tv.play();
        tv.nextChannel();
        tv.play();
    }
}
