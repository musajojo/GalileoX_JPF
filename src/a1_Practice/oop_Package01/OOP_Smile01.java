package a1_Practice.oop_Package01;

public class OOP_Smile01 {

    public static void main(String[] args) {


        int num = 5, i = 1;
        long factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);

    }

}
