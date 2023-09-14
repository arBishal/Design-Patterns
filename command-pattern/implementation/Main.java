import fx.Button;

public class Main {
    public static void main(String[] args) {

        var service = new CustomerService();

        var command1 = new AddCustomerCommand(service);
        var command2 = new SubmitFormCommand(service);

        var addButton = new Button(command1);
        var submitButton = new Button(command2);

        addButton.click();
        submitButton.click();
    }
}
