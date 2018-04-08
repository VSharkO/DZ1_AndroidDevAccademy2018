import java.util.Scanner;

public class Zadatak2 {
    //2. Write a program that asks the user for a number n and gives them the possibility to choose between computing the sum and computing the product of 1,…,n.
    public static void main(String[] args) {

        int number,state,mode;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter number: ");
        number = scanner.nextInt();
        System.out.printf("Enter: \"1\" for computing sum or \"2\" for computing product: ");
        mode = scanner.nextInt();

        switch (mode) {
            case 1:
                state=0;
                for (int i=1;i<number;i++){
                    state += i;
                }
                System.out.printf("Sum of numbers before %d is: " + state,number);
                break;

            case 2:
                state=1;
                for (int i=1;i<number;i++){
                    state *= i;
                }
                System.out.printf("Product of numbers before %d is: " + state,number);
                break;

            default: System.out.printf("Invalid operation");
                break;
        }

    }
}
