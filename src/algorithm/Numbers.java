package algorithm;

import algorithm.Sort;
import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

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
        storeRandomNumbers(num);

        // Selection Sort
        Sort algo = new Sort();
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort took: "
                + selectionSortExecutionTime + " milliseconds");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);

        int n = num.length;
        randomize(num, n);

        // Insertion Sort
        algo.insertionSort(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort took: "
                + insertionSortExecutionTime + " milliseconds");

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
    //Bubble Sort
//    int[] num = new int[1000000];
//    storeRandomNumbers(num);
//    Sort algo = new Sort();
//        algo.bubbleSort(num);
//    long selectionSortExecutionTime = algo.executionTime;
//        System.out.println("***** Bubble Sort *****");
//        algo.bubbleSort(num);
//    long bubbleSortExecutionTime = algo.executionTime;
//        System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort took: "
//            + insertionSortExecutionTime + " milliseconds");
//        connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_sort", "SortingNumbers");
//    List<String> numbers2 = connectToSqlDB.readDataBase("bubble_sort", "SortingNumbers");
//    printValue(numbers2);
//    randomize(num, n);
//
//    //Bucket Sort
//        System.out.println("***** Bucket Sort *****");
//        algo.bucketSort(num);
//    long bucketSortExecutionTime = algo.executionTime;
//        System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort took: "
//            + insertionSortExecutionTime + " milliseconds");
//        connectToSqlDB.insertDataFromArrayToSqlTable(num, "bucket_sort", "SortingNumbers");
//    List<String> numbers3 = connectToSqlDB.readDataBase("bucket_sort", "SortingNumbers");
//    printValue(numbers3);
//    randomize(num, n);
//
//    //Heap Sort
//        System.out.println("***** Heap Sort *****");
//        algo.heapSort(num);
//    long heapSortExecutionTime = algo.executionTime;
//        System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort took: "
//            + insertionSortExecutionTime + " milliseconds");
//        connectToSqlDB.insertDataFromArrayToSqlTable(num, "heap_sort", "SortingNumbers");
//    List<String> numbers4 = connectToSqlDB.readDataBase("heap_sort", "SortingNumbers");
//    printValue(numbers4);
//    randomize(num, n);
//
//    //Merge Sort
//        System.out.println("***** Merge Sort *****");
//        algo.mergeSort(num);
//    long mergeSortExecutionTime = algo.executionTime;
//        System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort took: "
//            + insertionSortExecutionTime + " milliseconds");
//        connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "SortingNumbers");
//    List<String> numbers5 = connectToSqlDB.readDataBase("merge_sort", "SortingNumbers");
//    printValue(numbers5);
//    randomize(num, n);
//
//    //Quick Sort
//        System.out.println("***** Quick Sort *****");
//        algo.quickSort(num);
//    long quickSortExecutionTime = algo.executionTime;
//        System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort took: "
//            + insertionSortExecutionTime + " milliseconds");
//        connectToSqlDB.insertDataFromArrayToSqlTable(num, "quick_sort", "SortingNumbers");
//    List<String> numbers6 = connectToSqlDB.readDataBase("quick_sort", "SortingNumbers");
//    printValue(numbers6);
//    randomize(num, n);
//
//    //Shell Sort
//        System.out.println("***** Shell Sort *****");
//        algo.shellSort(num);
//    long shellSortExecutionTime = algo.executionTime;
//        System.out.println("Total Execution Time of " + num.length + " numbers in Shell Sort took: "
//            + insertionSortExecutionTime + " milliseconds");
//        connectToSqlDB.insertDataFromArrayToSqlTable(num, "shell_sort", "SortingNumbers");
//    List<String> numbers7 = connectToSqlDB.readDataBase("shell_sort", "SortingNumbers");
//    printValue(numbers7);
//    randomize(num, n);


    public static void storeRandomNumbers(int[] num) {
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(1000000);
        }
    }

    public static void randomize(int[] arr, int n) {
        Random r = new Random();
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printValue(List<String> array) {
        for (String st : array) {
            System.out.println(st);
        }
    }
}