public class Tester {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Louis", 25.00);
        l(bankAccount.getOwner());
        l(bankAccount.getBalance());
        l("-----------------------------");
        SavingsAccount savingsAccount = new SavingsAccount("Bill", 125.00);
        savingsAccount.deposit(20.00);
        savingsAccount.addInterest();
        l(savingsAccount.getBalance());
        l("-----------------------------");
        CheckingAccount checkingAccount = new CheckingAccount("Ryan", 250.00, 250);
        checkingAccount.withdraw(25.00);
        checkingAccount.useCheck();
        l(checkingAccount.getBalance());
        l("-----------------------------");
        CheckingAccountFees checkingAccountFees = new CheckingAccountFees("Tchalla", 500, 20);
        checkingAccountFees.withdraw(25.00);
        checkingAccountFees.deductFees();
        checkingAccountFees.useCheck();
        l(checkingAccountFees.getBalance());
    }

    public static void l(Object s){
        System.out.println(s);
    }
}
