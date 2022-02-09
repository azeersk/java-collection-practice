import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class alMain {
    public static void main(String[] args){
        List<Integer> alOne = new ArrayList<>();
        for(int i=0; i<7; i++){
            alOne.add(i*2);
        }
        Iterator one = alOne.iterator();

        while(one.hasNext()){
            System.out.println(one.next());

        }

        System.out.println("arraylist is: "+ alOne);
        alOne.forEach(i->{System.out.print(i+" ");});

        System.out.println("contains: "+alOne.contains(4));
//        alOne.clear();
//        System.out.println("clear after alOne: "+ alOne);

        List<Integer> listOne = new LinkedList<>();
        System.out.println(listOne);
        System.out.println("adding elements: ");
        for(int i=0; i<7; i++){
            listOne.add(i*5);
        }
        for(int j=0; j<7; j++){
            listOne.add(j*4);
        }
        System.out.println();
        System.out.println(listOne);
        System.out.println();
        System.out.println(listOne.addAll(alOne));

        listOne.get(7);
        System.out.print("size of the linked list is: ");
        listOne.size();
        listOne.clear();
        System.out.println();
        System.out.println(listOne.isEmpty());

        List arraryListOne = new ArrayList();
        arraryListOne.add(12);
        arraryListOne.add("Something");
        arraryListOne.add(34);
        arraryListOne.add("Nothing");
        arraryListOne.add(23.34);
        System.out.println(arraryListOne);


    }
}
