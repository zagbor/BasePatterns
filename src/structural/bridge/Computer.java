package structural.bridge;

public abstract class Computer {
    protected CPU cpu;
    protected GPU gpu;


    protected Computer(CPU cpu, GPU gpu) {
        this.cpu = cpu;
        this.gpu =gpu;
    }

    public abstract void collectComputer();
}
