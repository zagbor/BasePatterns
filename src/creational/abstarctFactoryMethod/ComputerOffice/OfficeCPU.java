package creational.abstarctFactoryMethod.ComputerOffice;

import creational.abstarctFactoryMethod.CPU;

public class OfficeCPU implements CPU {
    @Override
    public void getCPU() {
        System.out.println("AMD RYZEN THREADRIPPER 2990WX ADDED to computer");
    }
}
