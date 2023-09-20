package pinkod;

import java.util.Scanner;

public class Belepes {

    final static Scanner sc = new Scanner(System.in);
    private int pinkod;

    public Belepes(int pinkod) {
        this.pinkod = pinkod;
        megadas();
    }

    private void megadas() {
        int i = 1;
        System.out.print("kérem a belépési kódot(" + i + "/3): ");
        int belepes = sc.nextInt();
        while (i < 3 && belepes != pinkod) {
            System.out.println("Hibás pin kód!");
            i++;
            System.out.print("kérem a belépési kódot(" + i + "/3): ");
            belepes = sc.nextInt();
        }
        if (belepes == pinkod) {
            System.out.println("Rendben, sikeres belépés!");
        } else {
            System.out.println("Hibás pin kód!");
            System.out.println("Belépés megtagadva!");
        }
    }
}
