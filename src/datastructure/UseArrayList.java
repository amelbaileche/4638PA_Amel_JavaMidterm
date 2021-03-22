package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Collections;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.sort(arrayList);
        ConnectToSqlDB connect = new ConnectToSqlDB();



        for(int i=0; i<= 5; i++){
            arrayList.add(i);
        }
        connect.insertDataFromIntegerArrayListToSqlTable(arrayList, "array_List","SortedNumbers");
        System.out.println(arrayList);

        arrayList.add(1, 4);

        arrayList.remove(6);

    }

}
