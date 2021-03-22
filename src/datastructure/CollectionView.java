package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionView {

    public static void main(String[] args) {
        /*
         Map is created and some data is inserted into it.
         Retrieve the Collection view of the values present in map
         */

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

        System.out.println("Values present in map: "  + map);


        List<String> riversOfUS = new ArrayList<>();
        riversOfUS.add("Colorado River");
        riversOfUS.add("Rio Grand River");
        riversOfUS.add("Ohio River");

        List<String> riversOfFrance = new ArrayList<>();
        riversOfFrance.add("River Garonne");
        riversOfFrance.add("River Rhine");
        riversOfFrance.add("River Saone");

        List<String> riversOfGermany = new ArrayList<>();
        riversOfGermany.add("River  Danobe");
        riversOfGermany.add("River Elbe");
        riversOfGermany.add("River Weser");

        List<String> riversOfRussia = new ArrayList<>();
        riversOfFrance.add("River  Lena");
        riversOfFrance.add("River Irtysh");
        riversOfFrance.add("River Ob");

        List<String> riversOfSpain = new ArrayList<>();
        riversOfFrance.add("River  Tajo");
        riversOfFrance.add("River Erbo");
        riversOfFrance.add("River Duero");

        Map<String, List <String>> map2 = new HashMap<>();
        map2.put("US",riversOfUS);
        map2.put("Germany", riversOfGermany);
        map2.put("UK", riversOfRussia);
        map2.put("France", riversOfFrance);
        map2.put("Spain", riversOfSpain);

        for(Map.Entry<String, List<String>> country: map2.entrySet()){
            System.out.println(country.getKey() + " " + country.getValue());
        }




        }

}
