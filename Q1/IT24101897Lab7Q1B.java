import java.util.Scanner;

public class IT24101897Lab7Q1B {
  
  public static void main(String[] args) {

      int mark1, mark2, mark3, mark4;
      double avg;
      String grade;
 
      Scanner input =  new Scanner(System.in);

      for(int student = 1; student <= 3; student++) {
        System.out.println("Student "+student);

        System.out.print("Enter marks : ");
    
          mark1 = input.nextInt();
          mark2 = input.nextInt();       
          mark3 = input.nextInt();
          mark4 = input.nextInt();

          System.out.println();

          avg = (mark1+mark2+mark3+mark4)/4.0;
          System.out.println("Average is : "+avg);

          grade = (avg >= 75) ? "Distinction":
                  (avg >= 50) ? "Credit" : "Fail";
          
          System.out.println("Overall Grade is: "+grade);

          System.out.println();

        }

   }

}
       