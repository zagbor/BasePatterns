package creational.abstarctFactoryMethod.ComputerGame;

import creational.abstarctFactoryMethod.MotherBoard;

public class GameMotherBoard implements MotherBoard {
    @Override
    public void getMotherBoard() {
        System.out.println("ASRock Fatal1ty B450 Gaming K4");
    }
}
