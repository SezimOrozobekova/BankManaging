import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder's name: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        // we create object person
        PersonalAccount person = new PersonalAccount(accountNumber, accountHolder);

        // testing process
        System.out.println("Name: " + person.getAccountHolder());
        System.out.println("ID: " + person.getAccountNumber());

        while (true){
            try {

                System.out.print("Enter operation (deposit/withdraw/transactions/quit): ");
                String operation = scanner.next();

                if (operation.equals("quit")) {
                    break;
                }



                if (operation.equals("deposit")) {
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    person.deposit(amount);
                } else if (operation.equals("withdraw")) {
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    person.withdraw(amount);
                }  else if (operation.equals("transactions")) {
                    person.printTransactionHistory(); // it will print all transactions
                    System.out.println("Balance: " + person.getBalance());
                }
            } catch (InsufficientBalanceException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }




    }
}
