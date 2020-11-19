package structural.facade;

public class Computer {
    CPU cpu = new CPU();
    GPU gpu = new GPU();
    MotherBoard motherBoard = new MotherBoard();

    public void start() {
        cpu.power();
        gpu.power();
        motherBoard.power();
    }

    boolean checkSystem() {
        if (cpu.isOnMessage() && gpu.isOnMessage() && motherBoard.isOnMessage()) {
            return true;
        } else {
            return false;
        }
    }
        void resultOfStart () {
            if (checkSystem()) {
                System.out.println("Компьютер включен");
            }
        }

    }