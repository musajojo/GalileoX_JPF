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
            case "sin":{
                result = Math.sin(num1.doubleValue());
                break;
            }
            case "cos": {
                result = Math.cos(num1.doubleValue());
                break;
            }
                case "tan":{
                    result = Math.sin(num1.doubleValue());
                    break;
                }
            case "!":{
                int num = (int) result, i = 1;
                long factorial = 1;
                while(i <= num)
                {
                    factorial *= i;
                    i++;
                }
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
        int newValue = 0;
        switch (operator) {
            case "C": {
                this.result = newValue;
                break;
            }
            case "e": {
                this.result = Math.E;

                break;
            }
            default: {
                result = 0;
            }
        }
        System.out.println(this.result);
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