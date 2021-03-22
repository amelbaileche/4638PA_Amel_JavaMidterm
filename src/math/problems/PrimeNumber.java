package math.problems;

import java.util.LinkedList;
import java.util.List;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
        Write a method to print the list of prime numbers from 2 to 1,000,000
            Solving the problem should be your first priority, however bonus points if you can figure out how to
            improve algorithmic efficiency

         Print out the prime numbers in the given range.
         */
        //List<Integer> primeList = new LinkedList<>();

        System.out.println( getPrimeNum());
    }

    public static boolean getPrimeNum() {

        long limit = 1000000;


        for (int i = 2; i <= 1000000; i++) {
            boolean isPrime = true;
            for (int j = 0; j <= 1000000; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
                if (isPrime) {
                    System.out.println(i + "");
                }
            }
        }return true;


    }
}





