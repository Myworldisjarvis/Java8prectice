package stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        
//        1- blank stream
        Stream<Object> empty = Stream.empty();
        System.out.println("--------------------------");
//       2 - array ,collection , object
        String ar[] = {"sadaf","hussain"};
        Stream<String> sa = Stream.of(ar);
        sa.forEach(e->{
            System.out.println(e);
        });
        
        System.out.println("--------------------------");
//      3 - builder
        Stream<Object> build = Stream.builder().build();
        
        System.out.println("--------------------------");
//      4- Arrays method
        IntStream stream = Arrays.stream(new int[]{1,2,3,4});
        stream.forEach(e->{
            System.out.println(e);
        });
        System.out.println("--------------------------");
//      5- collection, set,list derict call
        List<Integer> s = List.of(22,3,4,5,6,7);
        s.stream().forEach(e->System.out.println(e));

        
        
    }
}
