package Chapter_Ten1;

public class PayrollSystemTest {

    public static void main(String[] args) {


        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
               salariedEmployee.setBirthDate(new Date(9,25,2011));

        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        hourlyEmployee.setBirthDate(new Date(8,21,2000));

        CommissionEmployee commissionEmployee =
                new CommissionEmployee(
                        "Sue", "Jones", "333-33-3333", 10000, .06);
        commissionEmployee.setBirthDate(new Date(2,29,2011));

        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "444-44-4444", 5000, .04, 300);

        basePlusCommissionEmployee.setBirthDate(new Date(8,29,2011));

        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        for(Employee currentEmployee : employees) {
            System.out.println(currentEmployee);


            final int CURRENT_MONTH = 8;

            if (currentEmployee.getBirthDate().getMonth() == CURRENT_MONTH) {
                double newSalary = currentEmployee.earnings() + 100;
                System.out.println("Earnings with bonus: " + newSalary);
            }
        }
    }
}
