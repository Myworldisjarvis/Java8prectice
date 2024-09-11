package stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class StreamApi {

    public static void main(String[] args) {

        //Q) Create a List and Filter all even numbers form list 
        // List.of method creates a immutable object ( changes not allowed )
//      1)First Way to create a List
        List<Integer> list = List.of(2, 2, 30, 20, 11);
        //list.add(30); // we cannot add besouse immutable
        System.out.println(list);

//      2)Second Way to create a List
        List<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(2);
        list2.add(204);
        System.out.println(list2);

//      3)3rd Way to create a List
        List<Integer> list3 = Arrays.asList(22, 22, 33, 33, 44, 5, 5);
//         list3.add(3000); // we cannot add besouse immutable
        System.out.println(list3);

//      List (printing) iterate in a list 
        List<Integer> list4 = new ArrayList<>();

        for (Integer i : list) {

            //if even then add
            if (i % 2 == 0) {
                list4.add(i);
            }
        }
        System.out.print(list4);
        
//        print List using Stream API
        Stream<Integer> stream = list.stream();
        List<Integer> newlist = stream.filter(i->i%2==0).collect(Collectors.toList());
         System.out.print(newlist);

        // in one line
        List<Integer> newlist2 = list.stream().filter(e->e>10).collect(Collectors.toList());
             System.out.print(newlist2);

            
            
            
    }

}
