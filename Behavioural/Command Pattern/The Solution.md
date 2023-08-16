## The solution might be the Command Pattern.

We can release the `button` class from the the responsibility and create a `Command Interface` that will be implemented by the user where every button is a command object. Here's the scenario—

Let's assume, the user is developing a Bookshop System. S/he wants to add a customer by clicking a button. There'll be a `Command Interface` with an `execute()` method. A class `AddCustomer` to add a customer will implement the interface and call the `addCustomer()` method of another class `CustomerService` from the `execute()` method. So when the button is clicked, ultimately the `addCustomer()` will called. And with this implementation, we have avoided coupling between the invoker and the receiver.