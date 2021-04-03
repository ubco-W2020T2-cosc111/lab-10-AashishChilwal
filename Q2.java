import java.util.Scanner;
import java.util.Arrays;
public class Main {
 public static void main(String[] args) {
        int p =1 ;
        int k = 0;
    	String s1 = "Enter number of students: ";
    	String s2 = "Enter student grades: ";
  	double[] numbers = getNumsFromUser(s1, s2);
  	double max = 0 ; 
  	char[] letter = new char[100];
  	   for (int j=0;j<numbers.length;j++){
        if (numbers[j]>=max){
            max = numbers[j];}
        else
        {
            
        }
            
  	   }
        for (int j=0;j<numbers.length;j++){    
        if (numbers[j] >= (max-10.0))
            letter[j] = 'A' ;
        else if (numbers[j] >= (max-20.0))
            letter[j] = 'B' ;
        else if (numbers[j] >= (max-30.0))
            letter[j] = 'C' ;
        else if (numbers[j] >= (max-40.0))
            letter[j] = 'D' ;
        else 
            letter[j] = 'F';
            
        System.out.println("Student "+p+" score is "+numbers[j]+" and grade is "+letter[j]);
         p++;
    }
    
   /* for (int i = 0 ;i<numbers.length;i++){
         System.out.println("Student "+k+" score is "+numbers[i]+" and grade is "+letter[i]);
         k++;
    } */
 }
 public static double[] getNumsFromUser(String msg1, String msg2){
    int j ;
    Scanner input = new Scanner(System.in);
    String message_1 = "Enter number of students: ";
    System.out.print(message_1);
    int i = input.nextInt();
    double [] grades = new double[i];
    String message_2 = "Enter student grades: " ;
    System.out.print(message_2);
    for (j=0;j<i;j++)
    {
        grades[j] = input.nextDouble();
    }
    return grades;
}
public static void showLetterGrades(double[] grades){
    
}
}
