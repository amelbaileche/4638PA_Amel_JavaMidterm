package datastructure;

import databases.ConnectToSqlDB;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */



        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        ConnectToSqlDB connect = new ConnectToSqlDB();
        connect.insertDataFromStringToSqlTable("yearSeasons","Seasons");



        hash.put( "Amel", 1989);
        hash.put("Maxen", 2019);
        hash.put("Nassim", 1981);
        System.out.println( hash.get(1989));
        System.out.println( hash.get(1981));
        System.out.println(hash.remove(1981));
        System.out.println(hash.keySet());
        System.out.println(hash.entrySet());

        List<String> yearSeasons=new ArrayList<>();
        yearSeasons.add("SPRING");
        yearSeasons.add("SUMMER");
        yearSeasons.add("FALL");
        yearSeasons.add("WINTER");

        List<String>  seasonStartDate  =new ArrayList<>() ;
        seasonStartDate.add("March20");
        seasonStartDate.add("June20");
        seasonStartDate.add("September22");
        seasonStartDate.add("December21");

        Map<String, List <String>>  seasonWeather= new HashMap<>();

        seasonWeather.put("Warm", yearSeasons);
        seasonWeather.put("Hot",yearSeasons );
        seasonWeather.put("Chilly",yearSeasons );
        seasonWeather.put("Cold", yearSeasons);

        for(  String object: yearSeasons){
            System.out.println(object);
        }
        for (String date : seasonStartDate){
            System.out.println(date);
        }







    }

}
