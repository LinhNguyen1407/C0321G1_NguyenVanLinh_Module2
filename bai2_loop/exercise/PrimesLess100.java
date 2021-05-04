package bai2_loop.exercise;

public class PrimesLess100 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("List primes less 100: ");
        while (i < 100) {
            if (isPrimes(i)) {
                System.out.println(i);
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

