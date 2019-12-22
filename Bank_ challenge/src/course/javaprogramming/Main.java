package course.javaprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank();
        Branch dublin = new Branch("Dublin");
        Branch cork = new Branch("Cork");

        bank.addNewBranch(dublin.getBranchName());

        bank.addNewCustomer(dublin.getBranchName(),"Alex",1000);
        bank.addNewCustomer(dublin.getBranchName(),"Sylwia",154.25);
        bank.addCustomerTransaction(dublin.getBranchName(),"Alex",254.15);
        bank.addCustomerTransaction(dublin.getBranchName(),"Alex",24.15);
        bank.addCustomerTransaction(dublin.getBranchName(),"Alex",99.15);
        bank.addCustomerTransaction(dublin.getBranchName(),"Alex",4.15);

        bank.addNewBranch(cork.getBranchName());
        bank.addNewCustomer(cork.getBranchName(),"sylwia",254.59);
        bank.addNewCustomer(cork.getBranchName(),"maria",100.5);

        bank.listOfCustomers(dublin.getBranchName(),false);
        bank.listOfCustomers(cork.getBranchName(),true);




    }
}
