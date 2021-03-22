package algorithm;

import java.util.List;
import java.util.Random;

import databases.ConnectToSqlDB;

public class Numbers {

    /*
     * Show all the different kind of sorting algorithm by applying into (num array).
     * Display the execution time for each sorting.Example in below.
     *
     * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
     *
     * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
     *
     */

    public static void main(String[] args) throws Exception {

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        int[] num = new int[1000000];
//        storeRandomNumbers(num);

        // Selection Sort
        Sort algo = new Sort();
        algo.selectionSort(num);// buublesort nume
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort took: "
                + selectionSortExecutionTime + " milliseconds");

//        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
//        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
//        printValue(numbers);
//
//        int n = num.length;
//        randomize(num, n);
//
//        // Insertion Sort
//        algo.insertionSort(num);
//        long insertionSortExecutionTime = algo.executionTime;
//        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort took: "
//                + insertionSortExecutionTime + " milliseconds");
// quicksort,double sort,
        /*
         By following the same convention we used for Selection Sort, continue to do the same for all remaining sorting
            algorithms
         */


        /*
        Can you come to conclusion about which sorting algorithm is most efficient, given the size of the data set?
         */

    }




    /*
    HELPER METHODS
     */

//    public static void storeRandomNumbers(int[] num) {
//        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
//        Random rand = new Random();
//        for (int i = 0; i < num.length; i++) {
//            num[i] = rand.nextInt(1000000);
//            Sort algo = new Sort();
//            algo.mergeSort(num);//
//            long bubbleSortExecutionTime = algo.executionTime;
//            System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort took: "
//                    + bubbleSortExecutionTime + " milliseconds");
//
//            connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "SortingNumbers");
//            List<String> numbers = connectToSqlDB.readDataBase("merge_sort", "SortingNumbers");
//            printValue(numbers);
//
//            int n = num.length;
//            randomize(num, n);
//        }
    }

//    public static void randomize(int[] arr, int n) {
//        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
//        int[] num = new int[];
//
//        Random r = new Random();
//        // Start from the last element and swap one by one. We don't
//        // need to run for the first element that's why i > 0
//        for (int i = n - 1; i > 0; i--) {
//            int j = r.nextInt(i);
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            Sort algo = new Sort();
//            algo.selectionSort(num);
//            long selectionSortExecutionTime = algo.executionTime;
//            System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort took: "
//                    + selectionSortExecutionTime + " milliseconds");
//
//            connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_sort", "SortingNumbers");
//            List<String> numbers = connectToSqlDB.readDataBase("bubble_sort", "SortingNumbers");
//            printValue(numbers);
//
//            int n = num.length;
//            randomize(num, n);
//
//            // Insertion Sort
//            algo.mergeSort(num);
//            long mergeSortExecutionTime = algo.executionTime;
//            System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort took: "
//                    + mergeSortExecutionTime + " milliseconds");
//        }
//    }

//    public static void printValue(List<String> array) {
//        for (String st : array) {
//            System.out.println(st);
//
//        }
//    }
//}
