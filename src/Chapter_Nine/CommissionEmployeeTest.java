package Chapter_Nine;

public class CommissionEmployeeTest {

    public static void main(String[] args) {

        CommissionEmployee employee = new CommissionEmployee("John","Rose","222-222",
                5000,0.04);

        System.out.printf("Name of Employee is : %s %s%n",employee.getFirstName(),employee.getLastName());
        System.out.printf("Social Security Number is : %s%n",employee.getSocialSecurityNumber());
        System.out.printf("Gross Sales is : %s%n",employee.getGrossSales());
        System.out.printf("Commission Rate is : %s%n",employee.getCommissionRate());
        System.out.printf("The Earnings is : %s",employee.earning());

    }
}
