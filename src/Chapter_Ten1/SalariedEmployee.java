package Chapter_Ten1;

import Chapter_Ten1.Date;
import Chapter_Ten1.Employee;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String securityNumber, double weeklySalary) {
        super(firstName, lastName, securityNumber);
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public int setBirthMonth(Date birthDate) {
        birthDate.setMonth(8);
        setBirthDate(birthDate);
        return birthDate.getMonth();
    }

    @Override
    public String toString() {
        return String.format("%s%s",super.toString(),getWeeklySalary());
    }
}
