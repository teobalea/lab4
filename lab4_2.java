import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un număr întreg: ");
        int numar = scanner.nextInt();

        int sumaCifre = calculSumaCifre(numar);
        System.out.println("Suma cifrelor este: " + sumaCifre);
    }

    public static int calculSumaCifre(int numar) {
        int suma = 0;

        while (numar != 0) {
            int cifra = numar % 10;
            suma += cifra;
            numar /= 10;
        }

        return suma;
    }
}
