import java.util.Scanner;

class FibonacciDemo {
    static int n1 = 0, n2 = 1, n3 = 0;

    static void FibonacciCalc(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            FibonacciCalc(count - 1);
        }
    }

    public static void main(String args[]){    
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nHow many numbers do you want?");
        int count = scanner.nextInt();
        System.out.println("The numbers are: ");
     System.out.print(n1+" "+n2);//printing 0 and 1    
     FibonacciCalc(count-2);//n-2 because 2 numbers are already printed   
    }
}