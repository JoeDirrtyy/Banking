public class Account{

    private double balance;

  //  public Account(double balance) {
 //      this.balance = balance;
  //  }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
       if(balance < 0.00 ){
           System.out.println("no negative balance allowed");

       }else{
           this.balance = balance;
       }

    }

}


