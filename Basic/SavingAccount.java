// Usage of classes, methods and understanding of object-oriented programming.

package Complexity.Basic;

public class SavingAccount {

    // instance fields to store account details
    double balanceAccount; // balance of the account
    String userName; // name of the user
    int ageUser; // age of the user
    String cityUser; // city of residence of the user

    // Constructor method to initialize the account with user details
    public SavingAccount(double balance, String user, int age, String city ) {
        balanceAccount = balance;
        userName = user;
        ageUser = age;
        cityUser = city;
    }

    // Method to check and print the current balance of the account
    public void checkingAccount() {
        System.out.println("Your balance is " + balanceAccount);
    }

    // Method to deposit money into the account and update the balance
    public void depositAccount(double deposit) {
        balanceAccount = balanceAccount + deposit;
        System.out.println(">> Your current balance after deposit of $" + deposit+ " is $"+ balanceAccount);
    }

    // Method to withdraw money from the account and update the balance
    public void withdrawAccount(double withdraw) {
        balanceAccount = balanceAccount - withdraw;
        System.out.println(">> After withdrawal of $" + withdraw + " Your current balance changed to $" + balanceAccount);
    }

    // Main method to run the program and test the SavingAccount class
    public static void main(String[] args) {
        System.out.print("Constructor invoked! \n");

        // Create instances of SavingAccount class for two users
        SavingAccount vadzim = new SavingAccount(2000, "Vadzim Ramaniuk", 28, "Toronto");
        SavingAccount julia = new SavingAccount(3000, "Julia Kravchuk", 25, "Toronto");

        // Print out Vadzim's details
        System.out.println(
                "The first user is " +  vadzim.userName +
                        ". He lives in " + vadzim.cityUser +
                        ". He is "+vadzim.ageUser + ".");
        vadzim.depositAccount(350);
        vadzim.withdrawAccount(1000);

        System.out.printf("%n");

        // Print out Julia's details
        System.out.println(
                "The second user is " + julia.userName +
                        ". She lives in " + julia.cityUser +
                        ". She is " + julia.ageUser + ".");
        julia.depositAccount(2000);
        julia.withdrawAccount(345);
    }
}
