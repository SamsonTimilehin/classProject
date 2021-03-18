
public class Atm {
   private  String name;
    private double balance;
   public void setName(String name) {
       this.name = name;
   }

    public void deposit (double depositAmount){

        if ( depositAmount > 0.00)
           balance += depositAmount;


    }
    public void withdraw (double withdrawAmount){

        if ( withdrawAmount > 0.00)
            balance -= withdrawAmount;


    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


    public String getName() {
       return name;
   }
}

