package stream.api;

import java.util.List;
import java.util.Optional;
import java.util.stream.*;

public class Methods {

    public static void main(String[] args) {

        List<String> name = List.of("Aman","Ankit","Durga");
        
        // short cut to print list 
        name.stream().forEach(System.out::println);
        
//      ***************************FILLTER()*****************************
        //print value after filter using filter
        name.stream().filter(e->e.startsWith("A")).forEach(e->System.out.println(e));
        
        //collect value after filter using filter and collect and collectors.toList
        List<String> newList = name.stream().filter(e->e.startsWith("A")).collect(Collectors.toList()); 
        System.out.println(newList);
        
//      ***************************MAP()***************************** 
System.out.println("************************************************************************************************");
        List<Integer> num = List.of(1,2,3,4,5,6,7,8,9);
        
        //direct print
        num.stream().map(e->e*e).forEach(e->System.out.print(e+" "));
        System.out.println("\n");
        
        //colect data after map
        List<Integer> newNum = num.stream().map(e->e*e).collect(Collectors.toList());
        System.out.println(newNum);


System.out.println("************************************************************************************************");

//      ***************************sorted()*****************************  
        List<Integer> numunsort = List.of(2,2,1,3,5,6,7,8,9);
        numunsort.stream().sorted().forEach(System.out::print);
            
//      ***************************min()*********************************
        Integer newval = numunsort.stream().min((x,y)->x.compareTo(y)).get();
        System.out.print("\n"+newval+"\n");
        
//      ***************************max()********************************
        Integer newvall = numunsort.stream().max((x,y)->x.compareTo(y)).get();
        System.out.print(newvall+"\n");
        

         
        
        
    }    
}
