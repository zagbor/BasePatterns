package structural.facade;

public class GPU {

    private boolean isOn = false;
    public GPU() {
    }
    public void power(){
        isOn = true;
    }
    public boolean isOnMessage(){
        if(isOn){
            System.out.println("GPU включен");
            return true;
        }else {
            System.out.println("GPU выключен");
            return false;
        }

    }
}
