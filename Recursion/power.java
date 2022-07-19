package algorithms.Recursion;

import java.util.Scanner;

public class power {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base");
        double x=sc.nextDouble();
        System.out.println("Enter the power");
        int n=sc.nextInt();
        System.out.println(pow(x,n));

    }
    public static double pow(double x,int n){
        if(n==0){
            return 1;
        }
        return x*pow(x,n-1);
    }

}
