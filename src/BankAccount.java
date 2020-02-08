public class BankAccount {
    private String accountName;
    Amount balance;

    BankAccount(String accountName, String amount) {

        this.accountName = accountName;
        this.balance = new Amount(amount);
    } // BankAccount constructor

    public String getAccountDetails() {
        return this.balance.getBalance();

    } //getAccountDetails

    // Nested class
    private class Amount {
        private int dollars;
        private int cents;

        // Amount constructor
        Amount(String amount) {
            String[] parts = amount.split("\\.");
            this.dollars = Integer.parseInt(parts[0]);
            this.cents = Integer.parseInt(parts[1]);

        } // Amount constructor

        private String getBalance() {
            /*
            Notice that accountName is not prefixed with "this".
            Notice that accountName is not defined in the Amount class.
             */
            return accountName + ": $" + this.dollars + "." + this.cents + "0";
        } // getBalance

    } //amount class
} // BankAccount class

/*
In UML, you can use a circle with a plus inside the circle to indicate that a class is inside another class.

 */