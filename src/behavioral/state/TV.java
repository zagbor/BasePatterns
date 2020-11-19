package behavioral.state;

public class TV {
    TVchannel tvChannel;

    void setTvChannel(TVchannel tvChannel) {
        this.tvChannel = tvChannel;
    }

    public void nextChannel() {
        if (tvChannel instanceof BBC) {
            setTvChannel(new Fox());
        } else if (tvChannel instanceof Fox) {
            setTvChannel(new NBC());
        } else if (tvChannel instanceof NBC) {
            setTvChannel(new BBC());
        }
    }

    public void play() {
        tvChannel.play();
    }
}
