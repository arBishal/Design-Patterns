package fx;

public class Button {
    private String label;
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    // while clicking, we're just calling the execute() method instead of hardcoding what to do
    public void click() {
        command.execute();
    }
}
