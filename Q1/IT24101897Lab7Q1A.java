import java.util.Scanner;

public class IT24101897Lab7Q1A {

  public static void main (String[] args) {

    int mark1, mark2, mark3, mark4;
    double avg;
    String grade;
 
      Scanner input = new Scanner(System.in);

      System.out.println("Enter marks for four subjects: ");

      System.out.print("Enter subject mark 1: ");
      mark1 = input.nextInt();

      System.out.print("Enter subject mark 2: ");
      mark2 = input.nextInt();

     System.out.print("Enter subject mark 3: ");
     mark3 = input.nextInt();

     System.out.print("Enter subject mark 4: ");
     mark4 = input.nextInt();

     System.out.println();

     avg = (mark1+mark2+mark3+mark4)/4.0;  
     System.out.println("Average is : "+avg);

     grade = (avg >= 75) ? "Distinction":
             (avg >= 50) ? "Credit" : "Fail";

     System.out.println("Overall Grade is : "+grade);

  }

}

 
    
    