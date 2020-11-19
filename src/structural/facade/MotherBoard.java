package structural.facade;

public class MotherBoard {

    private boolean isOn = false;
    public MotherBoard() {
    }
    public void power(){
        isOn = true;
    }
    public boolean isOnMessage(){
        if(isOn){
            System.out.println("MotherBoard включен");
            return true;
        }else {
            System.out.println("MotherBoard выключен");
            return false;
        }
    }
}
