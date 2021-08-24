package Chapter_Ten1;

import java.time.LocalDateTime;

public class PayrollSystemTest {

    public static void main(String[] args) {

        //Date employeeBirthday = new Date(10,21,1998);



        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
               int salBirthMonth = salariedEmployee.setBirthMonth(new Date(9,25,2011));

        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        int hourlyEmployeeBirthMonth = hourlyEmployee.setBirthMonth(new Date(8,21,2000));

        CommissionEmployee commissionEmployee =
                new CommissionEmployee(
                        "Sue", "Jones", "333-33-3333", 10000, .06);
        int commEmployeeBirthMonth = commissionEmployee.setBirthMonth(new Date(2,29,2011));

        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "444-44-4444", 5000, .04, 300);
        int basePlusCommEmployeeBirthMonth = basePlusCommissionEmployee.setBirthMonth(new Date(7,29,2011));
        LocalDateTime presentDate = LocalDateTime.now();
        System.out.println(presentDate);
        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        for(Employee currentEmployee : employees){
            System.out.println(currentEmployee);
            System.out.println(currentEmployee.earnings());


            if(salBirthMonth == presentDate.getMonthValue()){
                double salEmployeeBonusWithEmployeesPay = salariedEmployee.earnings() + 100;
                System.out.println(salEmployeeBonusWithEmployeesPay);
            }else if(hourlyEmployeeBirthMonth == presentDate.getMonthValue()){
                double hourlyEmployeeBonusWithEmployeesPay = hourlyEmployee.earnings() + 100;
                System.out.println(hourlyEmployeeBonusWithEmployeesPay);
            }else if(commEmployeeBirthMonth == presentDate.getMonthValue()){
                double commEmployeeBonusWithPay = commissionEmployee.earnings() + 100;
                System.out.println(commEmployeeBonusWithPay);
            }
        }
    }
}
