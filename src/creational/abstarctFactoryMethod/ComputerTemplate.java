package creational.abstarctFactoryMethod;

public interface ComputerTemplate {
    CPU createCPU();
    MotherBoard createMotherBoard();
    GPU createGPU();

}
