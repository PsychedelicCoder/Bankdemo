import java.util.List;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer("Jon");
        Account account = new Account(c1);

        int newBalance = account.depositAmount(375);
        System.out.println(String.format("Ny balance: %d", account.getBalance()));

        newBalance = account.depositAmount(25);
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
