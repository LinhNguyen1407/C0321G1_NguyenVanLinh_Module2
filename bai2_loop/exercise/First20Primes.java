package bai2_loop.exercise;
import java.util.Scanner;

public class First20Primes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of primes: ");
        int number = input.nextInt();
        int count = 0;
        int i = 1;
        System.out.println("List primes: ");
        while (count < number) {
            if (isPrimes(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }

    public static boolean isPrimes(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
