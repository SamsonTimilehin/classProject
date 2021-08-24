package Chapter_Ten1;


import Chapter_Ten1.Date;

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String securityNumber;
    private Date birthDate;

    public Employee(String firstName, String lastName, String securityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.securityNumber = securityNumber;
        //this.birthDate = new Date(birthDate.getMonth(), birthDate.getDay(), birthDate.getYear());

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecurityNumber() {
        return securityNumber;
    }

    public void setBirthDate(Date birthDate) {

        this.birthDate = new Date(birthDate.getMonth(), birthDate.getDay(), birthDate.getYear());
    }

    public Date getBirthDate() {
        return birthDate;
    }


    @Override
    public String toString() {
        return String.format("%s %s%nSecurity Number: %s%nDate of birth: %s%n",firstName,lastName, securityNumber, birthDate);

    }
    public abstract double earnings();

    public abstract int setBirthMonth(Date birthDate);
}
