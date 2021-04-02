# Lab 10

## Expectations

We are expecting you to commit your work often with useful commit messages.
This is helpful for you so that there are regular commits that demonstrate your progress. 
In case you forget to push your final commits before the deadline, at least you will get partial marks.

This means that you should commit and push your changes to the repository at least **FIVE** times as you work this lab (more is recommended).
Repositories that have very few commits will be flagged for careful scrutiny and review, and you will **definitely** lose marks for this! 

## Q1: [10 marks] Read doubles and return them

[10 marks] Produce a method that reads in a set of values (double) from the user and returns them.

Use this header:
```
public static double[] getNumsFromUser(String msg1, String msg2) **
```

The implementation of the method should start with a message to input the total number of array elements, followed by a message to enter all the array elements. The method returns the array of elements. The two strings msg1 and msg2 that are passed to the method as parameters will be the two messages that tell the user what to do.
In the main class, use the following program outline to test this method:

```
public class Q1 {
 public static void main(String[] args) {
    	String s1 = "Enter number of students: ";
    	String s2 = "Enter student grades: ";
  	double[] numbers = getNumsFromUser(s1, s2);
  	System.out.println(Arrays.toString(numbers));
 }
 public static double[] getNumsFromUser(String msg1, String msg2){
  	//your code goes here
 }
}
```
### Sample Run:

```
Enter number of students: 4
Enter students grades: 12.5 23 11.5 27
[12.5, 23.0, 11.5, 27.0]
```

## Q2: [10 marks] Comparing marks

Create a complete program that uses the getNumsFromUser( ) method in Q1 to read in student marks (double) from the user, determines the highest mark, then ranks students based on how their mark compares to the highest mark, and displays their mark and letter grade. Use the following system of subtracting the student's mark from the highest mark to determine their letter grade.

|Mark |	mark ≥ best - 10	|mark ≥ best - 20|	mark ≥ best - 30|	mark ≥ best - 40|	otherwise|
|-----|-------------------|----------------|------------------|-----------------|----------|
|Grade|	A                 |B               |C                 |D                |F         |

You MAY write all your code for this question, along with the call for getNumsFromUser( ), inside the main method. However, if you choose to write a method for this code and call it in the main method, you may use this header:

```
public static void showLetterGrades(double[] grades)
```

### Sample run

```
Enter number of students: 4
Enter student grades: 67 93 55 78
Student 1 score is 67.0 and grade is C
Student 2 score is 93.0 and grade is A
Student 3 score is 55.0 and grade is D
Student 4 score is 78.0 and grade is B
```

## Q3.[10 marks] Checking if an array is sorted

In the main method, write test code that gets the user to enter a series of numbers using the getNumsFromUser( ) method in Q1, then use the isSorted( ) method to determine if the user’s numbers are sorted.

### Sample runs

```
How many numbers in the list 5
Enter the list: 4 5 7 9 10
The list is already sorted
```

```
How many numbers in the list? 5
Enter the list: 2 4 6 4 9
The list is not sorted
```

## Grading area

### Link to files

You do not have to do anything in this section.

[Q1 Java file](./Q1.java)

[Q2 Java file](./Q2.java)

[Q3 Java file](./Q3.java)

Remember to commit all your changes and to submit the link to this repository on Canvas.

