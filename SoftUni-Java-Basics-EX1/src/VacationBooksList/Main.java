package VacationBooksList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int pages=Integer.parseInt(scan.nextLine());
        int PagesPH=Integer.parseInt(scan.nextLine());
        int days=Integer.parseInt(scan.nextLine());
        int tameFB=(pages/PagesPH)/days;

        System.out.printf("%d",tameFB);


    }
}
