package behavioral.command;

public class StartCommand implements Command {
    ComputerControl computerControl;

    public StartCommand(ComputerControl computerControl) {
        this.computerControl = computerControl;
    }

    @Override
    public void execute() {
        computerControl.start();
    }
}
