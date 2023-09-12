import fx.Command;

public class AddCustomerCommand implements Command {
    private CustomerService service; //holds a reference of an object that executes the actual command

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    } //we will pass an object while construction

    @Override
    public void execute() {
        service.addCustomer();
    } //just calling the method that is going to do the actual work
}
