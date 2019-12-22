package course.javaprogramming;

import java.util.ArrayList;

public class Branch {
    private String BranchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        BranchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public boolean addNewCustomer(String customerName, double initialAmount){
        if(customerExists(customerName) == null){
            customers.add(new Customer(customerName,initialAmount));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = customerExists(customerName);
        //check if the customer exists
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer customerExists(String customerName) {
        for (int i = 0; i < customers.size() ; i++) {
            Customer checkedCustomer = customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }

        }
        return null;
    }

    public String getBranchName() {
        return BranchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
