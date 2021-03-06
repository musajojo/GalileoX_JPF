package exercises.gradedExercises.codingExercise03_Fix_It;
public class Passport {}
/*
Instructions:

The following program has errors, compile and run the program to check the errors.
Be careful before running the program, it may have infinite loops.
After finding the errors,
respond the questions below and select the right answers to find out if you discovered  the errors.
 */


//import java.util.Date;
//
//public class Passport {
//    int passportNumber;
//    String lastName, firstNames, nationality;
//    Date dateBirth, expirationDate;
//    char gender; //'F' for female, 'M' for male
//
//    public Passport (long id, String first, String last, String nationality, Date birthdate, Date expiration, char gender) {
//        this.passportNumber = id;
//        this.lastName = last;
//        this.firstNames = first;
//        this.nationality = nationality;
//        dateBirth = birthdate;
//        expirationDate = expiration;
//        this.gender = gender;
//    }
//
//    public char getGender() {
//        return this.gender;
//    }
//
//    public String getFullName() {
//        return this.firstNames + " " + this.lastName;
//    }
//
//    public boolean isExpired() {
//        Date today = new Date();
//
//        //the current year represented by this date, minus 1900 for today.
//        int currentYear = today.getYear() + 1900;
//        int expirationYear = expirationDate.getYear();
//
//        if (expirationYear < currentYear) {
//            return true;
//        }
//
//        while (currentYear == expirationYear) {
//            int currentMonth = today.getMonth();
//            int expirationMonth = expirationDate.getMonth();
//            if (currentMonth > expirationMonth) {
//                return true;
//            } else if (currentMonth == expirationMonth) {
//                int currentDay = today.getDate();
//                int expirationDay = expirationDate.getDate();
//                if (currentDay >= expirationDay) {
//                    return true;
//                }
//            }
//        }
//    }
//}