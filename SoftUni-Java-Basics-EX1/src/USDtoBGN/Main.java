package USDtoBGN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double USD=Double.parseDouble(scan.nextLine());
        double BGN = USD* 1.79549;
        System.out.print(BGN);


    }
}
