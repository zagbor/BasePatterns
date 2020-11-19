package behavioral.command;

public class Client {
    public static void main(String[] args) {
        ComputerControl computerControl = new ComputerControl();

        Computer computer = new Computer(
                new StartCommand(computerControl),
                new StopCommand(computerControl),
                new ResetCommand(computerControl)
        );

        computer.startComputer();
        computer.stopComputer();
        computer.resetComputer();

    }


}
