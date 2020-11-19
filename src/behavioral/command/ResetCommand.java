package behavioral.command;

public class ResetCommand implements Command {

    ComputerControl computerControl;

    public ResetCommand(ComputerControl computerControl) {
        this.computerControl = computerControl;
    }

    @Override
    public void execute() {
        computerControl.reset();
    }
}
