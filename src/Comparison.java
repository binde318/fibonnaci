import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        System.out.print(" Enter first number :");
        number1 = sc.nextInt();
        System.out.print(" Enter second number :");
        number2 = sc.nextInt();
        System.out.print(" Enter the third number :");
        number3 = sc.nextInt();
        if (number1==number2 || number1==number3) {
            System.out.printf("%d == %d ==%d ",number1,number2,number3);
            if (number3==number2 && number1==number3){
                System.out.printf(" %d == %d == %d ", number3,number1,number2);
            }else{
                System.out.println(" wrong");
            }
        }
    }
}
