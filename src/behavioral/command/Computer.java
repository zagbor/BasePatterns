package behavioral.command;

public class Computer {
    Command start;
    Command stop;
    Command reset;

    public Computer(Command start, Command stop, Command reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }

    public void startComputer(){
        start.execute();
    }

    public void stopComputer(){
        stop.execute();
    }

    public void resetComputer(){
        reset.execute();
    }
}
