import java.util.Scanner;

class Calculator {
    public float result;

    public void add(float num1, float num2) {
        result = num1 + num2;
        System.out.println("The sum of the given numbers: " + result);
    }

    public void subtract(float num1, float num2) {
        result = num1 - num2;
        System.out.println("The difference between the given numbers: " + result);
    }

    public void multiply(float num1, float num2) {
        result = num1 * num2;
        System.out.println("The product of the given numbers: " + result);
    }
}

class MyCalculator extends Calculator {
    public void divide(float num1, float num2) {
        result = num1 / num2;

        System.out.println("The division of the given numbers: " + result);
    }

    public void modulus(float num1, float num2) {
        result = num1 % num2;
        System.out.println("The remainder of the given numbers: " + result);
    }
}

public class ExtendsDemo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the two numbers.");
        float number1 = scanner.nextFloat();
        float number2 = scanner.nextFloat();
        MyCalculator object = new MyCalculator();
        object.add(number1, number2);
        object.subtract(number1, number2);
        object.multiply(number1, number2);
        object.divide(number1, number2);
        object.modulus(number1, number2);
    }
}