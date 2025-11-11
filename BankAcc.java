import java.util.*;

class BankAccount {

    int accountNumber;
    String accHolderName;
    double currentBalance;
    static double interestRate;

    // Default constructor
    BankAccount() {
        this.accountNumber = 0;
        this.accHolderName = "Siya";
        this.currentBalance = 12355.70;
        BankAccount.interestRate = 3450;
    }

    // Static block
    static {
        interestRate = 12.3;
    }

    // Parameterized constructor
    BankAccount(int accountNumber, String accHolderName, double currentBalance, double interestRate) {
        this.accountNumber = accountNumber;
        this.accHolderName = accHolderName;
        this.currentBalance = currentBalance;
        BankAccount.interestRate = interestRate;
    }
void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
}

void setAccHolderName(String accHolderName) {
    this.accHolderName = accHolderName;
}

void setCurrentBalance(double currentBalance) {
    this.currentBalance = currentBalance;
}

// static setter
static void setInterestRate(double rate) {
    BankAccount.interestRate = rate;
}
int getAccountNumber() {
    return this.accountNumber;
}

String getAccHolderName() {
    return this.accHolderName;
}

double getCurrentBalance() {
    return this.currentBalance;
}

// static getter
static double getInterestRate() {
    return BankAccount.interestRate;
}

    void display() {
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Holder Name : " + accHolderName);
        System.out.println("Current Balance     : " + currentBalance);
        System.out.println("Interest Rate       : " + interestRate);
        System.out.println();
    }
}
class BankAccountTest1 {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(244, "T", 39590, 75);
        b1.display();

        BankAccount b2 = new BankAccount(743, "A", 74390, 56);
        b2.display();

        BankAccount b3 = new BankAccount(244, "T", 4490, 12.6);
        b3.display();

        BankAccount. setInterestRate(9.0);
        b1.display();
        b2.display();
        b3.display();
    }
}
class BankAccountTest {

    public static void main(String[] args) {

        BankAccount arr[] = new BankAccount[3];

        arr[0] = new BankAccount();
        arr[1] = new BankAccount(4567, "Tanu", 34567, 324);
        arr[2] = new BankAccount(7890, "Priya", 55000, 450);

        for (int i = 0; i < 3; i++) {
            arr[i].display();
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int AccountNum = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String Name = sc.nextLine();

        System.out.print("Enter Current Balance: ");
        double Balance = sc.nextDouble();

        System.out.print("Enter Interest Rate: ");
        double rate = sc.nextDouble();

        BankAccount b1 = new BankAccount(AccountNum, Name, Balance, rate);

        System.out.println("\nUser Entered Account Details:");
        b1.display();
    }
}
