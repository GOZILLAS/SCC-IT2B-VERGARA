package vergaraact1;

import java.util.Scanner;

public class Receipt{
    
    public void Receipts(){
        
        
        Scanner input = new Scanner(System.in);
        
        String cusname, prod;
        int quati, pric, cash;
        
        System.out.print("Customer Name:");
        cusname = input.nextLine();
        System.out.print("Product Name:");
        prod = input.nextLine();
        System.out.print("Quatity:");
        quati = input.nextInt();
        System.out.print("Price:");
        pric = input.nextInt();
        System.out.print("Cash:");
        cash = input.nextInt();
        
        
        

        System.out.print("----------------------");
        System.out.print("\nRECEIPT");
        System.out.print("\n----------------------");
        System.out.print("\nName:"+cusname);
        System.out.print("\nItem:"+prod);
        System.out.print("\nQuatity:"+quati);
        System.out.print("\n----------------------");
        System.out.print("Total Due:"+(quati*pric));
         System.out.print("\n----------------------");
         System.out.print("Change :"+(cash-(quati*pric)));
        
        
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
        
    }
    
}
