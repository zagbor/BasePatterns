package creational.abstarctFactoryMethod.ComputerOffice;

import creational.abstarctFactoryMethod.CPU;
import creational.abstarctFactoryMethod.ComputerTemplate;
import creational.abstarctFactoryMethod.GPU;
import creational.abstarctFactoryMethod.MotherBoard;

public class ComputerOfficeFactory implements ComputerTemplate {


    @Override
    public CPU createCPU() {
        return new OfficeCPU();
    }

    @Override
    public MotherBoard createMotherBoard() {
        return new OfficeBoard();
    }

    @Override
    public GPU createGPU() {
        return new OfficeGPU();
    }
}
