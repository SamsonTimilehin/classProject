package Chapter_Nine;

public class BasePlusCommissionEmployeeTest {

    public static void main(String[] args) {

        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Queen","Jacob",
                "333-333",7000,0.03,400);


        System.out.printf("Name of Employee is : %s %s%n",employee.getFirstName(),employee.getLastName());
        System.out.printf("Social Security Number is : %s%n",employee.getSocialSecurityNumber());
        System.out.printf("Gross Sales is : %s%n",employee.getGrossSales());
        System.out.printf("Commission Rate is : %s%n",employee.getCommissionRate());
        System.out.printf("Base Salary is : %s%n",employee.getBaseSalary());
        System.out.printf("The Earnings is : %s",employee.earning());

    }
}
