package exercises.gradedExercises.codingExercise04_Calculator;

public class Calculator {
    Number result;

    public Calculator() {
        this.result = 0;
    }

    public void operate (String operator, Number num1) {
        //Make it better! Give a better solution for operate(String, Number)
        Number result = 0;
        switch (operator) {
            case "+": {
                result = this.result.doubleValue() + num1.doubleValue();
                break;
            }
            case "-": {
                result = this.result.doubleValue() - num1.doubleValue();
                break;
            }
            case "/": {
                result = this.result.doubleValue() / num1.doubleValue();
                break;
            }
            case "*": {
                result = this.result.doubleValue() * num1.doubleValue();
                break;
            }
            default: {
                result = num1;
            }
        }
        System.out.println(this.result.doubleValue() + " " + operator + " " + num1.doubleValue() + " = " + result.doubleValue());
        this.result = result;
    }

    public void operate (String operator) {
        //Complete the missing implementation
        //this.result = newValue
    }

    public void firstValue(Number num1) {
        this.result = num1;
    }

}

// Below is original code

//package exercises.gradedExercises.codingExercise04_Calculator;
//
//public class Calculator {
//    Number result;
//
//    public Calculator() {
//        this.result = 0;
//    }
//
//    public void operate (String operator, Number num1) {
//        //Make it better! Give a better solution for operate(String, Number)
//        Number result = 0;
//        switch (operator) {
//            case "+": {
//                result = this.result.doubleValue() + num1.doubleValue();
//                break;
//            }
//            case "-": {
//                result = this.result.doubleValue() - num1.doubleValue();
//                break;
//            }
//            case "/": {
//                result = this.result.doubleValue() / num1.doubleValue();
//                break;
//            }
//            case "*": {
//                result = this.result.doubleValue() * num1.doubleValue();
//                break;
//            }
//            default: {
//                result = num1;
//            }
//        }
//        System.out.println(this.result.doubleValue() + " " + operator + " " + num1.doubleValue() + " = " + result.doubleValue());
//        this.result = result;
//    }
//
//    public void operate (String operator) {
//        //Complete the missing implementation
//        //this.result = newValue
//    }
//
//    public void firstValue(Number num1) {
//        this.result = num1;
//    }
//
//}