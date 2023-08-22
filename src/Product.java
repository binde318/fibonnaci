import java.util.Arrays;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int product;
        System.out.print(" Enter first number :");
        number1 = input.nextInt();
        System.out.print(" Enter second number : ");
        number2 = input.nextInt();
        product= number1 * number2;
        System.out.printf("The product %d%n ", product);
    }
}
