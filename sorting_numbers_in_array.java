//Created on 2022/09/08
//By Suman Regmi

import java.util.Arrays;
import java.util.Scanner;

public class sorting_numbers_in_array {

    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want??");
        int n = scanner.nextInt();
        int[] number = new int[n];
        System.out.println("Enter the elements of array");
        for ( i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }
        Arrays.sort(number);
        System.out.println("The sorted numbers are:");
        for (i = 0; i < n; i++) {
            System.out.print(number[i] + "  ");
        }
    }
}