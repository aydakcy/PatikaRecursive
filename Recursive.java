import java.util.Scanner;

public class Recursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        while (sayi > 0) {
            System.out.print(sayi + " ");
            sayi = sayi - 5;
        }

        while (sayi <= 0) {
            System.out.print(sayi + " ");
            sayi = sayi + 5;
            if (sayi > 0) {
                System.out.print(sayi + " ");


            }
        }

    }

}