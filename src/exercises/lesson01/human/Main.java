package exercises.lesson01.human;

public class Main {

    public static void main(String[] args) {

        Human jack = new Human("Jack", "Smith", 'M', 23,
                "American", "Footballer");
        House home = new House("small", 2, 2, "Shed");

        jack.setOccupation("Boxer");

        String jackDeatils = jack.getFullName() + " is a " + jack.getAge() + " " + jack.getGender() +
                " who is " + jack.getNationality() + ". He works as a " + jack.getOccupation() +
                " and lives in a " + home.getHouseSize() + " house, with " + home.getNumberRooms() +
                " bedrooms" + " and " + home.getNumberBathrooms() + " bathrooms. " +
                "He is in the process of adding a " + home.getBuild() + ".";

        System.out.println(jackDeatils);
    }
}
