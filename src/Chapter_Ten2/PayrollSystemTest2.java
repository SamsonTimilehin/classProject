package Chapter_Ten2;

public class PayrollSystemTest2 {

    public static void main(String[] args) {

        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);

        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);

        PieceWorker pieceWorker =
                new PieceWorker("Kate", "Peter", "222-22-2222", 170.55, 200);

        CommissionEmployee commissionEmployee =
                new CommissionEmployee(
                        "Sue", "Jones", "333-33-3333", 10000, .06);

        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee(
                        "Bob", "Lewis","444-44-4444", 5000, .04, 300);


        Employee[] employees = new Employee[5];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = pieceWorker;
        employees[3] = commissionEmployee;
        employees[4] = basePlusCommissionEmployee;


        for(Employee currentEmployee : employees){
            System.out.println(currentEmployee);
            System.out.printf("earned $%,.2f%n%n",currentEmployee.earnings());
        }
    }
}
