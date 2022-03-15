package zaj_1;

import java.util.Scanner;

public class zad_7 {

    public static void main(String[] args) {
        int counter = 0;

        do {

            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj nieparzystą liczbę, która jest większa lub równa 5");
            int n = scan.nextInt();
            if (n >= 5 && n % 2 == 1) {
                counter++;
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {

                        if(i==1 || i == n || j==1 || j == n || i == j)
                            System.out.print("*");
                        else
                            System.out.print(" ");

                    }
                    System.out.println();

                }
            }
            else {

                System.out.println("Liczba nie spełnia warunków zadania. Podaj inną liczbę");

            }
        }

        while(counter<1);

    }
}
