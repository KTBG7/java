package udemy_exercises.bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Kevin's National Bank");

        bank.addBranch("Stonks");

        bank.addCustomer("Stonks", "Kevin", 150.50);
        bank.addCustomer("Stonks", "Jesus", 50.00);
        bank.addCustomer("Stonks", "Jose", 15.50);

        bank.addBranch("Stronk");

        bank.addCustomerTransaction("Stronk", "Shandy", 250.70);
        bank.addCustomerTransaction("Stronk", "Shandy", 250.70);

        bank.listCustomer("Stonks", true);
        bank.listCustomer("Stronk", true);

    }
}