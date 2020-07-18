package exercises.lesson01.account;

public class Account{

    public static int nextAccount = 1;

    public String name;
    public int accountNumber;
    public int balance;

    public Account(String n){
        name = new String(n);
        accountNumber = nextAccount;
        balance = 0;

        nextAccount++;
    }

    public Account(String n, int b){
        name = new String(n);
        accountNumber = nextAccount;
        balance = b;

        nextAccount++;
    }

    // I created a remaining balance method for fun
    public int remainingBalance(int withdrawn) {

        withdrawn = balance - withdrawn;
        return withdrawn;
    }

    // Homework answer
    public int withdraw(int amountwithdrawn) {

        if (amountwithdrawn <= balance) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        return amountwithdrawn;
    }

    public void deposit(int b){
        balance = balance + b;
    }

    public String toString(){
        return "\nname: " + name + "\naccount number: " + accountNumber + "\nbalance: " + balance;
    }
}