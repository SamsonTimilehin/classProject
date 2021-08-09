package Chapter_Nine;

public class HourlyEmployeeTest {

    public static void main(String[] args) {

        HourlyEmployee employee = new HourlyEmployee("Peter","Rachel",
                "444-555-666",40,300);

        employee.setHoursWorked(150);
        employee.setHourlyWage(2300);

        System.out.printf("Name of Employee is : %s %s%n",employee.getFirstName(),employee.getLastName());
        System.out.printf("Social Security Number is : %s%n",employee.getSocialSecurityNumber());
        System.out.printf("Hours Worked is : %s%n",employee.getHoursWorked());
        System.out.printf("Hourly Wage Rate is : %s%n",employee.getHourlyWage());
        System.out.printf("Employee Earnings is : %s",employee.earning());
    }
}
