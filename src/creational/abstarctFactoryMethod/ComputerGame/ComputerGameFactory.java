package creational.abstarctFactoryMethod.ComputerGame;

import creational.abstarctFactoryMethod.CPU;
import creational.abstarctFactoryMethod.ComputerTemplate;
import creational.abstarctFactoryMethod.GPU;
import creational.abstarctFactoryMethod.MotherBoard;

public class ComputerGameFactory implements ComputerTemplate {
    @Override
    public CPU createCPU() {
        return new GameCPU();
    }

    @Override
    public MotherBoard createMotherBoard() {
        return new GameMotherBoard();
    }

    @Override
    public GPU createGPU() {
        return new GameGPU();
    }
}
