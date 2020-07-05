package exercises.lesson01.human;

// firstName
// lastName
// gender
// nationality
// occupation
// age
public class Human {
    String firstName;
    String lastName;
    char gender;
    int age;
    String nationality;
    String occupation;

    public Human(String firstName, String lastName, char gender, int age, String nationality, String occupation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
        this.occupation = occupation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {

        return nationality;
    }

    public void setNationality(String nationality) {

        this.nationality = nationality;
    }

    public String getOccupation() {

        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
