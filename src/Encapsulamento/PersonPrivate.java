package Encapsulamento;

import java.util.Date;

public class PersonPrivate {
    private String name;
    private Date dateOfBirth;
    private Double height;

    @Override
    public String toString() {
        return "Encapsulamento.PersonPrivate{" +
                "name='" + name + '\'' +
                ", birthDate=" + dateOfBirth +
                ", height=" + height +
                '}' + "Sua idade é " + calculateAge(dateOfBirth);
    }

    public int calculateAge(Date dateOfBirth) {
        if (dateOfBirth == null) {
            return 0;
        }
        Date currentDate = new Date();
        long ageInMillis = currentDate.getTime() - dateOfBirth.getTime();
        long millisInYear = 1000L * 60 * 60 * 24 * 365;
        return (int) (ageInMillis / millisInYear);
    }

    public PersonPrivate() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date birthDate) {
        this.dateOfBirth = birthDate;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
