import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class setMain {
    public static void main(String[] args){
        Set<Integer> setOne = new HashSet<>();

        System.out.println("Empty check of set: "+ setOne.isEmpty());
        for(int i=0; i<5; i++){
            setOne.add(i);
        }
         for (int j=3; j<10; j++){
             setOne.add(j);
         }
         System.out.println("The final set is: "+setOne);
         System.out.println("is empty set: "+ setOne.isEmpty());
         System.out.print("set of numbers: ");
         setOne.forEach(s -> {System.out.print(s+ " ");});

         Set<Integer> setTwo = new LinkedHashSet<>();
         for(int k=0; k<5; k++){
             setTwo.add(k*4);
         }
         System.out.println();
         System.out.println("Set two: "+setTwo);
         setOne.addAll(setTwo);
         System.out.println("after addAll method: "+setOne);

         System.out.println("Size of the set: "+setOne.size());
         System.out.println("remove the element from the set: "+setOne.remove(12));
        setOne.clear();
         System.out.print(setOne);
     }
}
