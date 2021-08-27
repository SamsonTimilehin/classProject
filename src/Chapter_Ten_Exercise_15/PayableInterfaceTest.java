package Chapter_Ten_Exercise_15;

public class PayableInterfaceTest {

    public static void main(String[] args) {

        Payable[] payableObjects = new Payable[6];

        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] =
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        payableObjects[3] =
                new HourlyEmployee("Lisa", "Barnes", "888-88-8888", 120.00,30);
        payableObjects[4] =
                new CommissionEmployee("Peter","Jane","222-22-222",5000,0.5);
        payableObjects[5] =
                new BasePlusCommissionEmployee("Grace","Humble","555-55-5555",6000,0.5,2000);

        System.out.println(
                "Invoices and Employees processed polymorphically:");


        for (Payable currentPayable : payableObjects) {
            if(currentPayable instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentPayable;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());

//                System.out.printf(
//                        "new base salary with 10%% increase is: $%,.2f%n",
//                        employee.getBaseSalary());
            }

            System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(),
                    "payment due", currentPayable.getPaymentAmount());

        }
    }
}