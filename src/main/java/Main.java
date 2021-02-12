import java.util.List;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer("Jon");
        Account account = new Account(c1);

        int newBalance;

        try {
             newBalance = account.depositAmount(375);
        }catch (InvalidAmountException e) {
            e.printErrorMessage();
        }
        System.out.println(String.format("Ny balance: %d", account.getBalance()));

        try {
             newBalance = account.depositAmount(375);
        }catch (InvalidAmountException e) {
            e.printErrorMessage();
        }
        System.out.println(String.format("Ny balance: %d", account.getBalance()));

        try {
             newBalance = account.depositAmount(-10);
        }catch (InvalidAmountException e) {
            e.printErrorMessage();
        }
        System.out.println(String.format("Ny balance: %d", account.getBalance()));

        try {
            newBalance = account.withDrawAmount(200);
        } catch (InsufficientFundsException e) {
            e.printErrorMessage();
        }
        System.out.println(String.format("Ny balance: %d", account.getBalance()));


        try {
            newBalance = account.withDrawAmount(200);
        } catch (InsufficientFundsException e) {
            e.printErrorMessage();
        }
        System.out.println(String.format("Ny balance: %d", account.getBalance()));


    }
}
