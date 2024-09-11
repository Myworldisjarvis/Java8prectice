
package optionalclass;

import java.util.Optional;

public class ExampleOptional {

    
    // rea example of optional in dao layers
    public static Optional<String> getName(){
    
        String str = "Sadaf hussain";
        return Optional.ofNullable(str);
    }
    
    
    
    public static void main(String[] args) {
     
        //NullPointerException ke case me use kartre hai isko     
        String str = "sadaf husaain";
        String strr = null;


// ****************** OlD Type handling NullPointer exception*****************        
//       if(str==null){
//           System.out.println("str is null");
//       }else{
//           System.out.println(str+" size : "+str.length());
//       }
//*****************************************************************************


        Optional<String> optional = Optional.ofNullable(str);   //create optional object
        
        System.out.println(optional.isPresent());               // value hogi to true dega nhi hogi to false dega 
        System.out.println(optional.get());                     // value hogi to value dena nhi hogi to exception dega NoSuchElementException
        System.out.println(optional.orElse("No value"));        // value hogi to value denga nhi to msg dega (No Value)
        
        Optional<String> optionall = Optional.ofNullable(strr);
        System.out.println(optionall.isPresent());
        System.out.println(optionall.orElse("No value"));
//      System.out.println(optionall.get());                    //given exception NoSuchElementException
//********************************************************************************
        Optional<String> nameOptional = getName();
        System.out.println(nameOptional.orElse(" No Value found "));    


        
    }
}
