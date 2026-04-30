package three;

import java.util.Scanner;

public class six {
    public static int sum1(int a, int b, int c, int d, int e, int f) {
        return a + b + c + d + e + f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int n6 = sc.nextInt();
        int total = sum1(n1, n2, n3, n4, n5, n6);
        System.out.println("Sum = " + total);
        sc.close();
    }
}
