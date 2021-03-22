package math.problems;

public class Fibonacci {

    /*
    Write a method that will print or return at least 40 Fibonacci numbers

      0,1,1,2,3,5,8,13

     */

    public static void main(String[] args) {
        getFibonacciNum();

    }

    public static void getFibonacciNum(){

        int maxNumber=40;
        int previousNumber = 0;
        int nextNumber = 1;



        for(int i =1; i <= maxNumber; i++ ){
            System.out.print(previousNumber+" ");

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            System.out.println("Fibonacci series of" + maxNumber + "number:");

        }

    }


}
