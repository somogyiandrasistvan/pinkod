package pinkod;

import java.util.Scanner;

public class Pinkod {

    final static Scanner sc = new Scanner(System.in);

    public Pinkod() {
        int kod = bekeres();
        Belepes b = new Belepes(kod);
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

}
