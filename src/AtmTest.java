import java.util.Scanner;

public class AtmTest {
    public static void main(String[] args) {
        Atm driverClass = new Atm();
        driverClass.setBalance(0.00);
        driverClass.setName(" Mr Chibuzor");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome" + driverClass.getName());
        System.out.println("Create new pin");
        int pin = userInput.nextInt();
        System.out.println("Pin successfully created \n Enter your new pin");
        int newPin = userInput.nextInt();
        while (pin != newPin) {
            System.out.println("invalid pin");
            newPin = userInput.nextInt();

        }
            String select = """
                     
                     --> select 1 to deposit
                     --> select 2 to withdraw
                     --> select 3 to transfer
                     --> select 4 to recharge
                    """;
            System.out.println("Select option");
            int selectNumber = userInput.nextInt();
            switch (selectNumber) {
                case 1:
                    System.out.println("Enter Amount to deposit");
                    double depositAmount = userInput.nextDouble();
                    driverClass.deposit(depositAmount);
                    System.out.println("Balance " + driverClass.getBalance());
                    break;
                case 2:
                    System.out.println("Enter Amount to withdraw");
                    double withdraw = userInput.nextDouble();
                    //driverClass.withdraw();
                    break;
                case 3:
                    System.out.println("Enter Amount to transfer");
                    double transfer = userInput.nextDouble();
                    break;
                case 4:
                    System.out.println("Enter Amount to recharge");
                    double recharge = userInput.nextDouble();
                    break;
                default:
                    System.out.println("Wrong option selected!");
            }

    }
  }

