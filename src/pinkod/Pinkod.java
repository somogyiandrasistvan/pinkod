package pinkod;

import java.util.Scanner;

public class Pinkod {

    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int kod = bekeres();
        megadas(kod);
    }

    private static int bekeres() {
        System.out.print("kód megadása: ");
        String kod = sc.nextLine();
        while (kod.length() < 4 || kod.length() > 6) {
            System.out.println("Nem megfelelő formátum, minimum 4 maximum 6 számjegy legyen!");
            System.out.print("kód megadása: ");
            kod = sc.nextLine();
        }
        int pinkod = Integer.parseInt(kod);
        System.out.println("pin elmentve!");
        return pinkod;
    }

    private static void megadas(int kod) {
        int i = 1;
        System.out.print("kérem a belépési kódot(" + i + "/3): ");
        int belepes = sc.nextInt();
        while (i < 3 && belepes != kod) {
            System.out.println("Hibás pin kód!");
            i++;
            System.out.print("kérem a belépési kódot(" + i + "/3): ");
            belepes = sc.nextInt();
        }
        if (belepes == kod) {
            System.out.println("Rendben, sikeres belépés!");
        } else {
            System.out.println("Hibás pin kód!");
            System.out.println("Belépés megtagadva!");
        }
    }

}
