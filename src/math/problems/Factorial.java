package math.problems;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {
        System.out.println( getFactRecursion(5));
        System.out.println(getFactRecursion(10));



    }

    public static long getFactorial(int x){
        long  fact = 1;
        if( x <= 0){
            System.out.println("Invalid entry");
        }else{
            for( int i = 1; i <=x; i++ ){
                fact = fact * i;
                System.out.println( "factorial number " + x  + fact);
            }


        }
        return fact;

    }
    public static long getFactRecursion(int number) {

        if (number <= 0) {
            return 1;
        } else {
            return (number * getFactRecursion((number - 1)));
        }
    }
}


