import java.util.ArrayList;
//PersonalAccount class represents bank account with methods form managing transactions
class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    ArrayList<Amount> transactions = new ArrayList();
    /**
     * @param acNumber  The accountNumber to set
     * @param acHolder  The accountHolder to set
     * balance has initial value
     * */
    PersonalAccount(int acNumber, String acHolder) {
        this.accountNumber = acNumber;
        this.accountHolder = acHolder;
        this.balance = 0;
    }

    int getAccountNumber() {
        return this.accountNumber;

    }

    String getAccountHolder() {
        return this.accountHolder;
    }

    double getBalance() {
        return this.balance;
    }

    /**
     * @param m is amount. Must be a non-negative number
     */

    void deposit(double m) {
        if(m>=0){
            //create new Amount object
            Amount t = new Amount(m , "deposit");
            // add new onject to the list of transactions
            this.transactions.add(t);
            this.balance += m;
        } else {
            System.out.println("Unaccepted amount: " + m);
        }

    }

    /**
     * @param m is amount. Must be a non-negative number
     */
    void withdraw(double m) {
        if(m>=0){
            //create object
            Amount t = new Amount(m, "withdraw");
            //add to the transactions list
            this.transactions.add(t);
            this.balance -= m;
        }
        else {
            System.out.println("Unaccepted amount: " + m);
        }
    }

    void printTransactionHistory() {
        //loop for iterating through transactions
        for(int i = 0; i < this.transactions.size(); ++i) {
            // Amount t - assign to object a value at current index
            Amount t = this.transactions.get(i);
            System.out.println(t.getTransactionType() + " : " + t.getAmount());
        }

    }
}
