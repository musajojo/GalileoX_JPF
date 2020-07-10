package a1_Practice.other;

public class Droid {
    String name;
    int batteryLevel;

    public Droid(String droidName){
        name = droidName;
    }
    public Droid(int batteryLevelNow){
        batteryLevel = batteryLevelNow;
    }
    public String toString(){
        return "Hello, I’m the droid: " + name;
    }

    public void performTask(String task){
        System.out.println(name + " performing task: " + task);
    }


    public static void main(String[] args) {

        Droid codey = new Droid("Codey");
        Droid bat = new Droid(100-10);

        System.out.println(codey);
        codey.performTask("dancing");
        System.out.println(bat.batteryLevel);

    }
}