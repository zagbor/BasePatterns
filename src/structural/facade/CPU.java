package structural.facade;

public class CPU {
    private boolean isOn = false;
    public CPU() {
    }
     public void power(){
        isOn = true;
     }
     public boolean isOnMessage(){
        if(isOn){
            System.out.println("CPU включен");
            return true;
        }else {
            System.out.println("CPU выключен");
            return false;
        }
     }


}
