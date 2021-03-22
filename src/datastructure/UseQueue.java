package datastructure;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        Queue<Integer> q = new LinkedList<>();

     ConnectToSqlDB connect = new ConnectToSqlDB();

       connect.insertDataFromIntegerArrayListToSqlTable   ("q","integers");






        // Adds elements {0, 1, 2, 3, 4} to the queue
        for (int i = 0; i < 4; i++)
            q.add(i);


        System.out.println(q.size());
        q.add(5);
        q.add(6);
        System.out.println(q);
        int removedElement = q.remove();
        System.out.println("Removed element: " + removedElement);

        int firstElement = q.peek();
        System.out.println("Head of Queue: " + firstElement);
        int poll = q.poll();
        System.out.println(poll);

        System.out.println("Queue List: " + q);

        for (int x : q) {
            System.out.println(x);

            while (q.size() <= 3) {
                System.out.println(q);
            }
        }
    }
}












