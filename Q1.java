import java.util.Scanner;
import java.util.Arrays;
public class Q1 {
 public static void main(String[] args) {
    	String s1 = "Enter number of students: ";
    	String s2 = "Enter student grades: ";
  	double[] numbers = getNumsFromUser(s1, s2);
  	System.out.println(Arrays.toString(numbers));
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
}
