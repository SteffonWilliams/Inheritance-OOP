public class CheckingAccountFees extends CheckingAccount {

    private final double FEES = 20.00;

    public CheckingAccountFees(){
        super();
    }

    public CheckingAccountFees(String owner, double intialBalance, int intitalCheckCount){
        super(owner,intialBalance,intitalCheckCount);
    }

    public void deductFees(){
        this.withdraw(FEES);
    }
}
