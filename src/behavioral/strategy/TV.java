package behavioral.strategy;

public class TV {
 TVchannel tVchannel;

    public void setTVchannel(TVchannel tVchannel) {
        this.tVchannel = tVchannel;
    }

    public void executePlay(){
        tVchannel.play();
    }
}
