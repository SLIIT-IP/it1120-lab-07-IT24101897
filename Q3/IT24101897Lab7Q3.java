import java.util.Scanner;

public class IT24101897Lab7Q3 {
  
  public static void main(String[] args) {

   // Declare the variables for the amount, discountRate, discount, finalAmount
    double amount, discountRate, discount, finalAmount;
    discountRate = 0.05;    
    char paymentMode;       
   
  
     Scanner input = new Scanner(System.in);

     for(int customer = 1; customer<=5; customer++) {
    
        System.out.println("Customer "+customer);

        System.out.print("Enter total bill amount: ");
        amount = input.nextDouble();

        System.out.print("Enter mode of payment (C for cash, O for other): ");
        paymentMode = input.next().toUpperCase().charAt(0);

        boolean isValidPayemnt = true;

        switch(paymentMode){
      
             case 'C' :
                  
                  discount = amount * discountRate;    
                  System.out.println("Discount is: "+discount);    

                  amount = amount - discount;
        
                  break;

             case 'O' :
 
                   System.out.println("No discount applicable");
    
                   break;

             default :

                  System.out.println("Payment mode is not valid");
                  isValidPayemnt = false;   

          }
    
        
          if(isValidPayemnt) {
             System.out.println("Amount to be paid: "+amount);    
          }

        System.out.println();

    }

  }

}
  
           
          



   

    