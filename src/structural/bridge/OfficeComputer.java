package structural.bridge;

public class OfficeComputer extends Computer {
    public OfficeComputer(CPU cpu, GPU gpu) {
        super(cpu, gpu);
    }

    @Override
    public void collectComputer() {
        System.out.println("Computer collect in progress...");
        cpu.addCPUInComputer();

    }
}
