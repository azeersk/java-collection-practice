import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class mapMain {
    public static void main(String[] args){
        Map<String,String> mapOne = new HashMap<>();
        mapOne.put("Name "," ramcharan");
        mapOne.put("Id ", " 118055");
        mapOne.put("Roll No "," 49");
        mapOne.put("age ", " 33");
        mapOne.put("Cname "," Nayak");
        System.out.println("First details: ");
        System.out.println("Map is: "+ mapOne);
        System.out.println("Size of the map is: "+mapOne.size());
        System.out.print("Key values: ");
        for(String k: mapOne.keySet()){
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.print("Values are: ");
        for(String v: mapOne.values()){
            System.out.print(v + " ");
        }

        Map<String, String> mapTwo = new LinkedHashMap<>();
        mapTwo.put("Name1 "," pavan kalyan");
        mapTwo.put("Id1 "," 118099");
        mapTwo.put("Roll no1 "," 50");
        mapTwo.put("age1 "," 54");
        mapTwo.put("Cname1 "," vakeelsaab");
        System.out.println();
        System.out.println();
        System.out.println("Second details: ");
        System.out.println("Map is: "+ mapTwo);
        System.out.println("Size of the map is: "+ mapTwo.size());
        System.out.print("Keys of map: ");
        for(String k: mapTwo.keySet()){
            System.out.print(k + " ");
        }

        System.out.println();
        System.out.print("Values of map: ");
        for(String v: mapTwo.values()){
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.println();
        System.out.print("Third map values: ");
        mapOne.putAll(mapTwo);
        System.out.print(mapOne);
    }
}
