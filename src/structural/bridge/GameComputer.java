package structural.bridge;

public class GameComputer extends Computer{


    protected GameComputer(CPU cpu, GPU gpu) {
        super(cpu, gpu);
    }

    @Override
    public void collectComputer() {
        System.out.println("Computer collect in progress...");
        cpu.addCPUInComputer();
        gpu.addGPUInComputer();
    }
}
