import java.util.Scanner;
import java.util.Arrays;
public class Q3 {
 public static void main(String[] args) {
    	String s1 = "How many numbers in the list ";
    	String s2 = "Enter the list: ";
  	int[] numbers = getNumsFromUser(s1, s2);
  	if (isSorted(numbers) == true)
        System.out.println("The list is already sorted");
    else 
         System.out.println("The list is not sorted");
 }
 public static int[] getNumsFromUser(String msg1, String msg2){
    int j ;
    Scanner input = new Scanner(System.in);
    String message_1 = "How many numbers in the list ";
    System.out.print(message_1);
    int i = input.nextInt();
    int [] list = new int[i];
    String message_2 = "Enter the list: " ;
    System.out.print(message_2);
    for (j=0;j<i;j++)
    {
        list[j] = input.nextInt();
    }
   
    return list;
}
  public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true ;
}
}
