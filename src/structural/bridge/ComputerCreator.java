package structural.bridge;

public class ComputerCreator {
    public static void main(String[] args) {
        Computer[] computers = {
                new OfficeComputer(new CPUOffice(), new GPUOffice()),
                new GameComputer(new CPUGame(), new GPUGame())
        };

        for (Computer computer:computers) {
            computer.collectComputer();
        }
    }
}
