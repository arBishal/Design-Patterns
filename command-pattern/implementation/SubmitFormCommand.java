import fx.Command;

public class SubmitFormCommand implements Command {
    private CustomerService service; //holds a reference of an object that executes the actual command

    public SubmitFormCommand(CustomerService service) {
        this.service = service;
    } //initialization

    @Override
    public void execute() {
        service.submitForm();
    } //just calling the method that is going to do the actual work
}
