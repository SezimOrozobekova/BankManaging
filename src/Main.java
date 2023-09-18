public class Main {

    public static void main(String[] args) {

        // we create object person
        PersonalAccount person = new PersonalAccount(99670091, "Sezim");

        //testing process
        System.out.println("Name: " + person.getAccountHolder());
        System.out.println("ID: " + person.getAccountNumber());
        person.deposit(-4.0); // it will print unaccepted amount
        person.deposit(50.0); // we add 50 to balance
        person.withdraw(10.0); // we substack 10 from balance
        person.printTransactionHistory(); //it will print all transactions
        System.out.println("balance: " + person.getBalance());
    }
}
