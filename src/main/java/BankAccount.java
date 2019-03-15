public class BankAccount {

    private String owner;
    private double balance;


  public BankAccount(){

      owner = "Steffon Williams";
      balance = 0.00;
  }


  public BankAccount(String owner, double balance){

      this.owner = owner;
      this.balance = balance;
  }


  public void deposit(double amount){
      balance += amount;
      //balance = balance + amount
  }

  public void withdraw(double amount){

      balance -= amount;
      //balance = balance - amount
  }

  public String getOwner(){
      return this.owner;
  }
  public double getBalance(){
      return this.balance;
  }

}
