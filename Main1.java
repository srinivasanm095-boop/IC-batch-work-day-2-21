abstract class BankAccount{
    abstract double calculateInterest();
    void displayAccountType(){
        System.out.println("Bank Account Details");
    }
}
class SavingsAccount extends BankAccount{
    double balance;
    @Override 
    double calculateInterest() {
        return balance*0.05;
    }
}
public class Main1 {
    public static void main(String[] args){
        SavingsAccount sa=new SavingsAccount();
        sa.balance = 50000;
        sa.displayAccountType();
        System.out.println("Interest: " + sa.calculateInterest());
    }
}
