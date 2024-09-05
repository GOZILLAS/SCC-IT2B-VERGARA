
package vergaraact1;

import java.util.Scanner;


public class AgeCalculator {
    public void getAge(){ 
    
      Scanner input = new Scanner(System.in);
                 
         String fname;
         int byear;
         
         System.out.print("Enter your Name:");
         fname = input.nextLine();
          System.out.print("Enter birth year:");
          byear = input.nextInt();
          
       
         
         System.out.print("hello "+fname+"\nYOUR AGE IS "+(2024-byear));
  
    }
}
