package exercises.lesson01.controlFlow;

public class ControlFlow {

    public static void main(String[] args) throws Exception {

        for( int i = 0; i < 100 ; i ++ ) {

            if( i % 2 != 0) {
                System.out.println(i + " I'm a Odd number");
            }
        }
//          Or Just:
//        for( int i = 1; i < 100;i += 2) {
//        System.out.println(i + " I'm a Odd number");}
    }
}