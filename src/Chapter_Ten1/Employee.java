package Chapter_Ten1;


import Chapter_Ten1.Date;

import java.time.LocalDateTime;

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String securityNumber;
    private Date birthDate;

    public Employee(String firstName, String lastName, String securityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.securityNumber = securityNumber;


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

        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }


    @Override
    public String toString() {
        return String.format("%s %s%nSecurity Number: %s%nDate of birth: %s%n",firstName,lastName, securityNumber,birthDate);

    }
    public abstract double earnings();


}
