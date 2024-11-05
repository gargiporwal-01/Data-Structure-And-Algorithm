// Average of 3 Numbers

import java.util.Scanner;

public class Average0fnumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int average = (A+B+C)/3;

        System.out.println("Average is:" + average);
        sc.close();
    }
}