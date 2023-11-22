//Created on 2022/11/15
//By Suman Regmi


import java.util.Scanner;

public class c_AreaOfCircle {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the radius");
        double r= s.nextDouble();
        double area= (22*r*r)/7;
        System.out.println("Area of Circle is "+ area);
    }
}
