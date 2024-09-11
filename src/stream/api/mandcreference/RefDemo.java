package stream.api.mandcreference;

public class RefDemo {

    public static void main(String[] args) {
        System.out.println("learning method reference....");

        //1 provide the implimantation WorkInter
        WorkInter wi = () -> {
            System.out.println("hi");
        };

        wi.doTask();
        
        System.out.println("************************************************");
        
        //2 provide the implimantation using static method ref WorkInter
        
        WorkInter wi1 = Staff::doStaff;
        wi1.doTask();
        
        
        //2 provide the implimantation using instance method ref WorkInter
        //Object::methodName
        Staff ss = new Staff();
        WorkInter wi11 = ss::doStaff1;
        wi11.doTask();
        
        
        
        
    }
}
