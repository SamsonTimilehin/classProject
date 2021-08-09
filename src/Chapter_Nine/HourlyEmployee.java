package Chapter_Nine;

public class HourlyEmployee extends Employee {

    private double hoursWorked;
    private double hourlyWage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hoursWorked, double hourlyWage) {
        super(firstName, lastName, socialSecurityNumber);

        if(hourlyWage < 0.0){
            throw new IllegalArgumentException("Hourly Wage must not be < 0.0");
        }
        if(hoursWorked < 0.0 || hoursWorked > 168){
            throw new IllegalArgumentException("Hours Worked must be between 0 and 168");
        }

        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;


    }
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if(hoursWorked < 0.0 || hoursWorked > 168){
            throw new IllegalArgumentException("Hours Worked must be between 0 and 168");
        }
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        if(hourlyWage < 0.0){
            throw new IllegalArgumentException("Hourly Wage must not be < 0.0");
        }
        this.hourlyWage = hourlyWage;
    }
    public double earning(){
        return hoursWorked * hourlyWage;
    }

    @Override
    public String toString() {
        return String.format("%s%s%s%f%f",getFirstName(),getLastName(),getSocialSecurityNumber(),hoursWorked, hourlyWage);
    }
}
