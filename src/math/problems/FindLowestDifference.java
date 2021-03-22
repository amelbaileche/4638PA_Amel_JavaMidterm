package math.problems;

public class FindLowestDifference {

    /*int minDiff=arr1[0]-arr2[0];
          for(int i=1;i< arr1.length;i++){
              for(int j=1;j< arr2.length;j++){
                  int diff=arr1[i]-arr2[j];
                  if(diff<minDiff){
                      minDiff=diff;
                  }
              }

          }
          return minDiff;
      }*/
    public static void main(String[] args) {
        /*
         Write a method to return the the lowest difference between these two arrays
            HINT: The lowest difference between these arrays is 1
        */

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        System.out.println(LowestDiff(array1, array2));

    }

    public static int LowestDiff(int array1[], int array2[]) {

        int diff ;
        int lowDiff ;
        lowDiff = Math.abs(array1[0]-array2[0]);

        for (int i = 0; i < array1.length; i++) {
            for (int a = 0; a < array2.length; a++) {
                diff = Math.abs(array1[i] - array2[a]);
                if (lowDiff < diff) {
                    diff= lowDiff;
                }
            }

        }return lowDiff;

    }
}

