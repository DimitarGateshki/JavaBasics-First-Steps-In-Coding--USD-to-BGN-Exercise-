package FishTank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double lg=Double.parseDouble(scan.nextLine());
        double width=Double.parseDouble(scan.nextLine());
        double tall=Double.parseDouble(scan.nextLine());
        double pro=Double.parseDouble(scan.nextLine());
        double volume=(lg*tall*width)*0.001;
        double liters=volume*(1-(pro*0.01));
        System.out.printf("%.2f",liters);


    }
}
