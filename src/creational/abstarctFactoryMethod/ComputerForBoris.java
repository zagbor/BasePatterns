package creational.abstarctFactoryMethod;

import creational.abstarctFactoryMethod.ComputerGame.ComputerGameFactory;

public class ComputerForBoris {
    public static void main(String[] args) {


        ComputerTemplate computerTemplate = new ComputerGameFactory();

        CPU cpu = computerTemplate.createCPU();
        GPU gpu = computerTemplate.createGPU();
        MotherBoard motherBoard = computerTemplate.createMotherBoard();

        cpu.getCPU();
        gpu.getGPU();
        motherBoard.getMotherBoard();
    }
}
