package structural.facade;

public class UserStart {
    Computer computer = new Computer();

   public void start(){
        computer.start();
        computer.resultOfStart();
    }
}
