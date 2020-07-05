package exercises.lesson01.human;
// size
// number of rooms
// number of bathrooms
// build method and build a garage, a new garden, or anything that is in its parameters.
public class House {
    public String getHouseSize;
    String houseSize;
    int numberRooms;
    int numberBathrooms;
    String build;

    public House (String houseSize, int numberRooms, int numberBathrooms, String build) {
        this.houseSize = houseSize;
        this.numberRooms = numberRooms;
        this.numberBathrooms = numberBathrooms;
        this.build = build;
    }

    public String getHouseSize() {
        return houseSize;
    }

    public void setHouseSize(String houseSize) {
        this.houseSize = houseSize;
    }

    public int getNumberRooms() {
        return numberRooms;
    }

    public void setNumberRooms(int numberRooms) {
        this.numberRooms = numberRooms;
    }

    public int getNumberBathrooms() {
        return numberBathrooms;
    }

    public void setNumberBathrooms(int numberBathrooms) {
        this.numberBathrooms = numberBathrooms;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }
}
