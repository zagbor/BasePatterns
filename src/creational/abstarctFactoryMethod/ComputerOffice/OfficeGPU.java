package creational.abstarctFactoryMethod.ComputerOffice;

import creational.abstarctFactoryMethod.GPU;

public class OfficeGPU implements GPU {

    @Override
    public void getGPU() {
        System.out.println("ASUS ROG Strix B550-F");
    }
}
