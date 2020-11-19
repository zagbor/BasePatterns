package creational.abstarctFactoryMethod.ComputerGame;

import creational.abstarctFactoryMethod.CPU;

public class GameCPU implements CPU {
    @Override
    public void getCPU() {
        System.out.println("Intel Core i7-7820X");
    }
}
