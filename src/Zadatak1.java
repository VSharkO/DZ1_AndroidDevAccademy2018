
import java.util.Scanner;

public class Zadatak1 {
    //1. Write a program that asks the user for a number n and prints the sum of the numbers 1 to n

    public static void main(String[] args) {
        int number,suma=0;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter number: ");

        number = scanner.nextInt();

        for (int i=1;i<number;i++){

                suma += i;
        }

        System.out.printf("Suma brojeva do broja %d je: " + suma,number);

    }
}
