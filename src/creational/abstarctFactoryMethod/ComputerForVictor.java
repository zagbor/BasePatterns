package creational.abstarctFactoryMethod;

import creational.abstarctFactoryMethod.ComputerOffice.ComputerOfficeFactory;

public class ComputerForVictor {
    public static void main(String[] args) {
        ComputerTemplate computerTemplate = new ComputerOfficeFactory();

        CPU cpu = computerTemplate.createCPU();
        GPU gpu = computerTemplate.createGPU();
        MotherBoard motherBoard = computerTemplate.createMotherBoard();

        cpu.getCPU();
        gpu.getGPU();
        motherBoard.getMotherBoard();
    }
}
