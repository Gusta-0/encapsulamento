package Encapsulamento;

import java.util.Date;

public class PlayerPublic {

    String name;
    String position;
    Date dateOfBirth;
    String nationality;
    Double height;
    Double weight;

    PersonPrivate person = new PersonPrivate();

    @Override
    public String toString() {
        return "Encapsulamento.PlayerPublic{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", nationality='" + nationality + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}' + "Sua idade é " + person.calculateAge(this.dateOfBirth);
    }

    public int CalculateRetirementAge () {
        int age = person.calculateAge(this.dateOfBirth);
        int retirementAge;
        if (this.position != null) {
            switch (this.position.toLowerCase()) {
                case "goalkeeper":
                    retirementAge = 40;
                    break;
                case "defender":
                    retirementAge = 40;
                    break;
                case "midfielder":
                    retirementAge = 38;
                    break;
                case "attacker":
                    retirementAge = 35;
                    break;
                default:
                    retirementAge = 36;
            }
        } else {
            retirementAge = 35;
        }
        return retirementAge - age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
