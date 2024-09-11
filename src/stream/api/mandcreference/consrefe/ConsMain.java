package stream.api.mandcreference.consrefe;

import java.util.List;

public class ConsMain {

    public static void main(String[] args) {

        System.out.println("learning const. Reference");

        // lambda implimentation 
        Provide p = () -> {
            return new Student();
        };

        Student student = p.getStudent();
        student.display();
        
        
        System.out.println("-----------------------------------------------------------------------------------");
        
        //Constructor ref
        //Classname::new   
        Provide p1 = Student::new;
        

        Student student1 = p1.getStudent();
        student.display();
        
        System.out.println("-----------------------------------------------------------------------------------");
        
        
        List<Integer> list = List.of(1,2,3,4);
        System.out.println(list);
        list.stream().forEach(System.out::print);
        
        list.stream().forEach(e->System.out.println(e+"\n "));
        
        
        
        
    }
}
