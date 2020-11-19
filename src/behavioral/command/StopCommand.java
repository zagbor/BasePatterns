package behavioral.command;

public class StopCommand implements Command {

    ComputerControl computerControl;

    public StopCommand(ComputerControl computerControl) {
        this.computerControl = computerControl;
    }

    @Override
    public void execute() {
        computerControl.stop();
    }
}
