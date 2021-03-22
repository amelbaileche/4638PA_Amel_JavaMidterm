package math.problems;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         If n = 10, then array will have 9 elements in the range from 1 to 10.
            For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).

         Write a method to find the missing number from the array.
          public static int missingNumber(int arr[], int n)
    {
        int m = n + 1;
        int total = m*(m + 1)/2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return total - sum;
    }
         */
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};

        System.out.println( findMissingNum(array,9));
    }
    public static int findMissingNum (int array [], int a){

        int x = a +1;

        int total = x*(x + 1)/2;
        int sum =0;
        for(int i =0; i< a; i++){
            sum = sum + array[i];
        }
      return total -sum;

    }
}
