package udemy_exercises.bank;

import java.util.*;

public class Branch {
    private String name;
    private ArrayList<Customer> customer;

    public Branch(String name) {
        this.name = name;
        this.customer = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customer.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customer.size(); i++) {
            Customer checkedCustomer = this.customer.get(i);
            if (this.customer.get(i).getName().equals(customerName)) {
                return checkedCustomer;
            }
        }

        return null;
    }

}

/*
 ** Branch Class**: - addCustomer and initial transaction amount. - Also needs to
 * add additional transactions for that customer/branch
 */
