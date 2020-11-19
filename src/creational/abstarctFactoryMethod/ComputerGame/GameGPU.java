package creational.abstarctFactoryMethod.ComputerGame;

import creational.abstarctFactoryMethod.GPU;

public class GameGPU implements GPU {
    @Override
    public void getGPU() {
        System.out.println("GeForce GTX 1660 Ti GAMING");
    }
}
