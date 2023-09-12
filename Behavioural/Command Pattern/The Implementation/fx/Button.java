package fx;

public class Button {
    private String label;
    private Command command; //reference of the command interface

    public Button(Command command) {
        this.command = command;
    } //we will pass an object while construction

    public void click() {
        command.execute();
    } // while clicking, we're just calling the execute() method instead of hardcoding what to do
}
