package a1_Practice;


enum Cars {
    SMALL, MEDIUM, LARGE;
}

public class A1_Practice {

    public static void main(String[] args) {

        Cars car = Cars.SMALL;

        if (car == Cars.LARGE){
            System.out.println("Big Car");
        }else if (car == Cars.MEDIUM){
            System.out.println("Mid Range");
        }else if (car == Cars.SMALL){
            System.out.println("Tinny");
        }

    }
}
