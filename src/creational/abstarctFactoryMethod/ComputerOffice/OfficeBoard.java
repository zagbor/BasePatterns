package creational.abstarctFactoryMethod.ComputerOffice;

import creational.abstarctFactoryMethod.MotherBoard;

public class OfficeBoard implements MotherBoard {
    @Override
    public void getMotherBoard() {
        System.out.println("ASUS ROG Strix B550-F");
    }
}
