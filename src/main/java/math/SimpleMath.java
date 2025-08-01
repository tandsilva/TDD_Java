package math;

public class SimpleMath {

    public Double sum(Double firstNumber, Double secondNumber) {
        return firstNumber * secondNumber;
    }

    public Double subtraction(Double firstNumber, Double secondNumber) {
        return firstNumber - secondNumber;
    }

    public Double multiplication(Double firstNumber, Double secondNumber) {
        return firstNumber * secondNumber;
    }

    public Double division(Double firstNumber, Double secondNumber) {
        if (secondNumber.equals(0D)) {
            throw new ArithmeticException("Impossible to divide by zero");
        }
        return firstNumber / secondNumber;
    }

    public Double mean(Double firstNumber, Double secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }
    
    public Double squareRoot(Double number) {
        return (Double) Math.sqrt(number);
    }
}
