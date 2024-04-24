import java.util.*;
public class ATm {

    double balance;
    int pin=3245;
    Scanner sr=new Scanner(System.in);
    //check atm pin
    public void checkpi(){
        System.out.println("enter atm pin");
        int enter=sr.nextInt();
        if(pin==enter){
            options();
        }
        else{
            System.out.println("invaild pin try again!");
        }
    }

    void options() {
        System.out.println("1. Deposite ");
        System.out.println("2. Withdraw ");
        System.out.println("3. check your bank balace");
        System.out.println("4. Exit");
        int ch;
        System.out.println("Enter your choice");

        ch= sr.nextInt();
//Access atm functions
switch (ch){
    case 1: Deposite();
    break;
    case 2: Withdraw();
    break;
    case 3: checkbalance();
    break;
    case 4: exit();
    break;
    default:System.out.println("Invalid options");
}

    }
    public void Deposite(){

            System.out.println("Enter Deposit amount:");
            double amount = sr.nextDouble();
            if (amount <= 0) {
                System.out.println("Invalid amount.");
            } else {
                balance += amount; // Update the balance with the deposited amount
                System.out.println("Successful Deposit of " + amount + ". New balance: " + balance);
            }
            options();
        }

    public void Withdraw(){
        System.out.println("Enter withdraw amount");
        int wamt=sr.nextInt();
        if(wamt>balance){
            System.out.println("your balance is less"+balance);
        }
        else{
            balance=balance-wamt;
            System.out.println("Now your current balance is: "+balance);
        }
        options();
    }
public void checkbalance(){
        System.out.println("Balance is: "+balance);
        options();;
}
public void  exit(){

    System.exit(0);
}
}
class Main{
    public static void main(String[]argus){
        ATm ac=new ATm();
        ac.checkpi();
    }
}
