public class CheckingAccount extends BankAccount{
    private int remainingChecks;

    public CheckingAccount(){
        super();
        remainingChecks = 100;
    }

    public CheckingAccount(String owner, double initialBalance, int remainingChecks){
        super(owner, initialBalance);
        this.remainingChecks = remainingChecks;

    }

    public void useCheck(){
        remainingChecks--;
    }

    public void getCheck(){
        remainingChecks++;
    }
}
