package exercises.lesson01.account;
/**
 * Main class of the Java program.
 */

/*
Instructions:

Add a method on account named "withdraw" that removes an 'amount' of money given on the parameters,
only if the balance has  enough money and return true, if not return false.
*/
public class Main {

    public static void main(String[] args) {
        Account alice = new Account("Alice", 100);
        Account bob = new Account("Bob");

        System.out.println(alice);
        System.out.println(bob);

        System.out.println(alice.nextAccount);
        System.out.println(bob.nextAccount);
        System.out.println(Account.nextAccount);

    }
}

