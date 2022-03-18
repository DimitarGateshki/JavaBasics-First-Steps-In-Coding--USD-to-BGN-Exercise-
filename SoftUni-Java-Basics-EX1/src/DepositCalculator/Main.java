package DepositCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    double depSum=Double.parseDouble(scan.nextLine());
    double time = Double.parseDouble(scan.nextLine());
    double lih = Double.parseDouble(scan.nextLine());
    double finalSum=depSum+(time*((depSum*lih/100)/12));

    System.out.printf("%.2f",finalSum);


}
}
