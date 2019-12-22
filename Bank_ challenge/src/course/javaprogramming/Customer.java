package course.javaprogramming;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        transactions = new ArrayList<Double>();
        addInitialAmount(initialAmount);
    }

    private void addInitialAmount(double initialAmount) {
        transactions.add(initialAmount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public double addTransaction(double amount) {
        transactions.add(amount);
        return amount;
    }
}
